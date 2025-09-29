package behavioral.command.commands;

import behavioral.command.Editor;

public class CutCommand extends Command {
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        var selected = editor.textField.getSelectedText();
        if(selected == null || selected.isEmpty()) return false;

        backup();
        var source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source){
        var start = source.substring(0, editor.textField.getSelectionStart());
        var end  =  source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
