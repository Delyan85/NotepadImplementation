public class Demo {

    public static void main(String[] args) {
        INotepad securedNotepad = new SecuredNotepad("123");

        securedNotepad.createPage("Title1", "Text1");
        securedNotepad.createPage("Title2", "Text2");
        securedNotepad.createPage("Title3", "Text3");
        securedNotepad.createPage("Title4", "Text4");
        securedNotepad.createPage("Title5", "Text5");

        try {
            securedNotepad.replaceText(2, "bla");
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }


        try {
            securedNotepad.deleteText(3);
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        securedNotepad.previewAllPages();

//        INotepad myNotepad = new SimpleNotepad();
//
//        myNotepad.createPage("Title1", "Text1");
//        myNotepad.createPage("Title2", "Text2");
//        myNotepad.createPage("Title3", "Text3");
//        myNotepad.createPage("Title4", "Text4");
//        myNotepad.createPage("Title5", "Text5");
//
//
//        try {
//            myNotepad.replaceText(33, "ReplacedText");
//        } catch (PageNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            myNotepad.deleteText(10);
//        } catch (PageNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        myNotepad.previewAllPages();


    }
}
