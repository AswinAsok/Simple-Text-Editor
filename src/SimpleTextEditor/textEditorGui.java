package SimpleTextEditor;

 import java.awt.Font;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Aswin Asok
 */
public class textEditorGui extends javax.swing.JFrame {
    String filename="";                                                         //To Store The Location Or Filename Of The File Opened.
    String Title="Untitled-SimpleText Editor";
    Clipboard clipboard = getToolkit().getSystemClipboard();
    boolean textAreaModified=false;                                             //To Check Whether Text Area Was Modified.
    boolean filesaved=false;                                                    //To Check Whether File Was Saved.
    
    
    public void defaultTitle()                                                  //Function To Set Default Title.
    {
        Title="Untitled-SimpleText Editor";
        setTitle(Title);
    }
    
    public void SetTitle()                                                      //Function To Set The Title When A New File Is Opened.
    {
        Title=(filename.substring((filename.lastIndexOf("\\")+1),(filename.length())));
        setTitle(Title+="-Simple Text Editor");
    }
    

    public textEditorGui() {                                                    //Constructor To Initalize The Components.
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        cutTextR = new javax.swing.JMenuItem();
        copyTextR = new javax.swing.JMenuItem();
        pasteTextR = new javax.swing.JMenuItem();
        deleteTextR = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cutText = new javax.swing.JMenuItem();
        copyText = new javax.swing.JMenuItem();
        pasteText = new javax.swing.JMenuItem();
        deleteText = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        cutTextR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-cut-25.png"))); // NOI18N
        cutTextR.setText("Cut");
        cutTextR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutTextRActionPerformed(evt);
            }
        });
        jPopupMenu1.add(cutTextR);

        copyTextR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-copy-25.png"))); // NOI18N
        copyTextR.setText("Copy");
        copyTextR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTextRActionPerformed(evt);
            }
        });
        jPopupMenu1.add(copyTextR);

        pasteTextR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-paste-special-25.png"))); // NOI18N
        pasteTextR.setText("Paste");
        pasteTextR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteTextRActionPerformed(evt);
            }
        });
        jPopupMenu1.add(pasteTextR);

        deleteTextR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-delete-25.png"))); // NOI18N
        deleteTextR.setText("Delete");
        deleteTextR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTextRActionPerformed(evt);
            }
        });
        jPopupMenu1.add(deleteTextR);

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        textArea.setBackground(new java.awt.Color(255, 255, 255));
        textArea.setForeground(new java.awt.Color(0, 0, 0));
        textArea.setRows(5
        );
        textArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textAreaMouseReleased(evt);
            }
        });
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(240, 240, 240));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-file-25.png"))); // NOI18N
        jMenu1.setText("File");

        newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-new-25.png"))); // NOI18N
        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jMenu1.add(newFile);

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-open-sign-25.png"))); // NOI18N
        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-save-25.png"))); // NOI18N
        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-edit-25.png"))); // NOI18N
        jMenu2.setText("Edit");

        cutText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        cutText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-cut-25.png"))); // NOI18N
        cutText.setText("Cut");
        cutText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutTextActionPerformed(evt);
            }
        });
        jMenu2.add(cutText);

        copyText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-copy-25.png"))); // NOI18N
        copyText.setText("Copy");
        copyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTextActionPerformed(evt);
            }
        });
        jMenu2.add(copyText);

        pasteText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-paste-special-25.png"))); // NOI18N
        pasteText.setText("Paste");
        pasteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteTextActionPerformed(evt);
            }
        });
        jMenu2.add(pasteText);

        deleteText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        deleteText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-delete-25.png"))); // NOI18N
        deleteText.setText("Delete");
        deleteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTextActionPerformed(evt);
            }
        });
        jMenu2.add(deleteText);

        jMenuBar1.add(jMenu2);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-monitor-25.png"))); // NOI18N
        jMenu4.setText("Window");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-maximize-window-25.png"))); // NOI18N
        jMenuItem3.setText("Maximize");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-minimize-window-25.png"))); // NOI18N
        jMenuItem4.setText("Minimize");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-exit-25.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu4.add(exit);

        jMenuBar1.add(jMenu4);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleTextEditor/icons8-about-25.png"))); // NOI18N
        jMenu3.setText("About Us");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        
        
        int response=0;
        
        if(textAreaModified==true&&filesaved==false)                            //Verifing That The Text Area Was Modified By The User And The File Wasn't Saved.
        {
        ImageIcon i=new ImageIcon("C:\\Users\\Aswin Asok\\Documents\\NetBeansProjects\\textEditor\\src\\SimpleTextEditor\\icons8-question-mark-35.png");
        Object[] option1 = {"Yes","Save And Then Create a New File","Cancel"};  //Array Having List of Option Available For The User.           
         
         response = JOptionPane.showOptionDialog(this,"Do You Want To Create a New File Without Saving This One ?","Confirm",JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE,i, option1,JOptionPane.NO_OPTION);  //To Save User Response Choice.
         
                                                       
            if(response==JOptionPane.NO_OPTION)                                 //Opening The Save Dialog Box To Save The Document.
           {
             FileDialog fileDialog = new FileDialog (textEditorGui.this, "Save File",FileDialog.SAVE);
        fileDialog.setVisible(true);
                                                                                
        
        if(fileDialog.getFile() != null){
              filename = fileDialog.getDirectory() + fileDialog.getFile();
              setTitle(filename);
              
        
        }
        try {
                 try (FileWriter fileWriter = new FileWriter(filename)) {
                     fileWriter.write(textArea.getText());
                     setTitle(filename);
                 }
            
            
        }catch(IOException e){
            System.out.println("File Not Found");
        }
        
           }
            
           }
        if(response==JOptionPane.NO_OPTION||response==JOptionPane.YES_OPTION)
        {
            
            textArea.setText(null);                                             //Deleting Characters Present in JTextArea And Setting It To null.    
            defaultTitle();                                                     //Assinging The Default Title As a New File Has Been Created. 
        }
        
    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
                                                                                //To Open The Browse Window And To Open The Selected File.
        
        
        textArea.setFont(new Font(null,Font.PLAIN,16));                         //To Set Font To The JTextArea.
        FileDialog fileDialog = new  FileDialog(textEditorGui.this, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            
            
        }
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                StringBuilder sb = new StringBuilder();
                
                String line = null;
                
                while((line = reader.readLine()) != null) {
                    StringBuilder append = sb.append(line).append("\n");
                    textArea.setText(sb.toString());
                }
            }
            
        }catch(IOException e){
            System.out.println("File Not Found");
           
            
        }
        Title=(filename.substring((filename.lastIndexOf("\\")+1),(filename.length())));
        setTitle(Title+="-Simple Text Editor");
        
        if(filename==null)
            defaultTitle();
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
                                                                                //To Open The Browse Window And To Save The File In A Requied Location.
        filesaved=true;
        FileDialog fileDialog = new FileDialog (textEditorGui.this, "Save File",FileDialog.SAVE);
        fileDialog.setVisible(true);
        

            if(fileDialog.getFile() != null){
              filename = fileDialog.getDirectory() + fileDialog.getFile();
              setTitle(filename);
              
        
        }
            
        try {
            try (FileWriter fileWriter = new FileWriter(filename)) {
                fileWriter.write(textArea.getText());
                setTitle(filename);
                textAreaModified=false;
            }
            
            
        }catch(IOException e){
            System.out.println("File Not Found");
            
            
        }
        SetTitle();
        
    }//GEN-LAST:event_saveFileActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
                                                                                //To Exit The Application Completely
        ImageIcon i=new ImageIcon("C:\\Users\\Aswin Asok\\Documents\\NetBeansProjects\\textEditor\\src\\SimpleTextEditor\\icons8-question-mark-35.png");
    
     if(filesaved==false&&textAreaModified==true)                                //To Notify The User That The Documnet Wasn't Saved And Asks The User Whehter He Wants To Save The File Or Not.
     {
         Object[] option1 = {"Yes","Save And Then Exit","Cancel"};              //Array Obect[] Containing Available Options For The Dialog Box.
         
         int response = JOptionPane.showOptionDialog(this,"Do You Want To Exit Without Saving ?","Confirm",JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE,i, option1,JOptionPane.NO_OPTION);  //To Save User Response Choice.
         
           if(response==JOptionPane.YES_OPTION)                                 //To Exit The Application As The User Selected YES_OPTION.
               System.exit(0);                                                  
           else if(response==JOptionPane.NO_OPTION)
           {
             FileDialog fileDialog = new FileDialog (textEditorGui.this, "Save File",FileDialog.SAVE);
        fileDialog.setVisible(true);
                                                                                //To Save The File And To Exit The Application As The User Selected NO_OPTION.
        
        if(fileDialog.getFile() != null){
              filename = fileDialog.getDirectory() + fileDialog.getFile();
              setTitle(filename);
              
        
        }
        try {
                 try (FileWriter fileWriter = new FileWriter(filename)) {
                     fileWriter.write(textArea.getText());
                     setTitle(filename);
                 }
            
            
        }catch(IOException e){
            System.out.println("File Not Found");
        }
        System.exit(0);
        
           }
               
     }
         else
     {
         int response =    JOptionPane.showConfirmDialog(this,"Do You Want To Exit ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,i);
           if(response==JOptionPane.YES_OPTION)                                 //To Confirm That The User Wants To Exit The Application.
               System.exit(0);
     }
     
    }//GEN-LAST:event_exitActionPerformed

    private void copyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTextActionPerformed
                                                                                //To Copy The Selected Text To The Clipboard.
        
       
        String CopyText = textArea.getSelectedText();
        StringSelection copySelection = new StringSelection(CopyText);
        clipboard.setContents(copySelection, copySelection);
        
    }//GEN-LAST:event_copyTextActionPerformed

    private void pasteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteTextActionPerformed
                                                                                //To Paste The Text From The Clipboard.
        if(!(Title.startsWith("*")))
        {
        Title="*"+Title;
        setTitle(Title);
        }
        try {
        Transferable PasteText = clipboard.getContents(textEditorGui.this);
        String sel = (String) PasteText.getTransferData(DataFlavor.stringFlavor);
        textArea.replaceRange(sel,textArea.getSelectionStart(),textArea.getSelectionEnd());
        }
        catch(UnsupportedFlavorException | IOException e){
            System.out.println("Did not Work");
        }
        
    }//GEN-LAST:event_pasteTextActionPerformed

    private void cutTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutTextActionPerformed
                                                                                //To Cut The Selected Text To The Clipboard.
       if(!(Title.startsWith("*")))
        {
        Title="*"+Title;
        setTitle(Title);
        }
        String cutString = textArea.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipboard.setContents(cutSelection, cutSelection);
        textArea.replaceRange(null, textArea.getSelectionStart(),textArea.getSelectionEnd());
        
    }//GEN-LAST:event_cutTextActionPerformed

    private void deleteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTextActionPerformed
                                                                                //To Delete The Selected Text From The JTextArea.
        if(!(Title.startsWith("*")))
        {
        Title="*"+Title;
        setTitle(Title);
        }
        textArea.replaceRange(null, textArea.getSelectionStart(),textArea.getSelectionEnd());
        
    }//GEN-LAST:event_deleteTextActionPerformed

    private void cutTextRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutTextRActionPerformed
                                                                                //To Cut The Selected Text To The Clipboard(Right Click Menu).
        if(!(Title.startsWith("*")))
        {
        Title="*"+Title;
        setTitle(Title);
        }
        String cutString = textArea.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipboard.setContents(cutSelection, cutSelection);
        textArea.replaceRange(null, textArea.getSelectionStart(),textArea.getSelectionEnd());
        
    }//GEN-LAST:event_cutTextRActionPerformed

    private void copyTextRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTextRActionPerformed
                                                                                //To Copy The Selected Text To The Clipboard(Right Click Menu).
        
        String CopyText = textArea.getSelectedText();
        StringSelection copySelection = new StringSelection(CopyText);
        clipboard.setContents(copySelection, copySelection);
        
    }//GEN-LAST:event_copyTextRActionPerformed

    private void pasteTextRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteTextRActionPerformed
                                                                                //To Paste The Text From The Clipboard(Right Click Menu).
       if(!(Title.startsWith("*")))
        {
        Title="*"+Title;
        setTitle(Title);
        }
        try {
        Transferable PasteText = clipboard.getContents(textEditorGui.this);
        String sel = (String) PasteText.getTransferData(DataFlavor.stringFlavor);
        textArea.replaceRange(sel,textArea.getSelectionStart(),textArea.getSelectionEnd());
        }
        catch(UnsupportedFlavorException | IOException e){
            System.out.println("Did not Work");
        }
        
    }//GEN-LAST:event_pasteTextRActionPerformed

    private void deleteTextRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTextRActionPerformed
                                                                                //To Delete The Selected Text From The JTextArea(Right Click Menu).
        if(!(Title.startsWith("*")))
        {
        Title="*"+Title;
        setTitle(Title);
        }
        textArea.replaceRange(null, textArea.getSelectionStart(),textArea.getSelectionEnd());
        
    }//GEN-LAST:event_deleteTextRActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
                                                                                //To Display the About Us Dialog Box.
        Object[] Option={"Cancel"};
        ImageIcon i=new ImageIcon("C:\\Users\\Aswin Asok\\Documents\\NetBeansProjects\\textEditor\\src\\SimpleTextEditor\\icons8-about-35.png");
        JOptionPane.showOptionDialog(null,"This is a Simple Text Editor Created By Aswin Asok","About Us",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,i,Option,JOptionPane.NO_OPTION);
        
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.setExtendedState(ICONIFIED);                                       //To Minimize The Application.
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setExtendedState(MAXIMIZED_BOTH);                                  //To Maximize The Application.
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void textAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAreaMouseReleased
                                                                                //To Make The Edit Menu Appear On JTextArea When The User Right Clicks In The JTextArea.
        if(evt.isPopupTrigger())
            jPopupMenu1.show(this,evt.getX(),evt.getY());
    }//GEN-LAST:event_textAreaMouseReleased

    private void textAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyTyped
        
        
        if(!(Title.startsWith("*")))
        {
        Title="*"+Title;
        setTitle(Title);
        }
        textAreaModified=true;
        textArea.setFont(new Font(null,Font.PLAIN,16));                         //To Set Font To The JTextArea.
    }//GEN-LAST:event_textAreaKeyTyped

    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {                                    //Main 
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new textEditorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyText;
    private javax.swing.JMenuItem copyTextR;
    private javax.swing.JMenuItem cutText;
    private javax.swing.JMenuItem cutTextR;
    private javax.swing.JMenuItem deleteText;
    private javax.swing.JMenuItem deleteTextR;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem pasteText;
    private javax.swing.JMenuItem pasteTextR;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
