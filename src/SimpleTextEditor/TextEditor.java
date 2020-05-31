package SimpleTextEditor;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TextEditor {                                                       //Class Name

    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();     //To Get The Default Screen Size.
        int width = screenSize.width;                                           //To Store The Width Of The Screen.
        int height = screenSize.height;                                         //To Store The Height Of The Screen.
        textEditorGui obj = new textEditorGui();
        obj.setBounds(0, 0, width, height);                                     //Setting The Size Of textEditorGui.
        obj.setTitle("Untitled-Simple Text Editor");                            //Assigning The Title Of textEditorGui.
        obj.setResizable(true);                                                 //Assigning The Resaizable Value Of textEditorGui To Be true.
        obj.setVisible(true);                                                   //Assigning The setVisible Function to Be true.
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
