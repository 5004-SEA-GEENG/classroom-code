
import controller.ArgController;

import model.BookModel;

public class FileConverter {
    public static void main(String[] args) {
        //if this doesn't run, loadLibrary might be set to CSV instead of XML

        ArgController parser = new ArgController();
        parser.parseArgs(args);
        BookModel model = BookModel.getInstance(parser.getInputFile());
        parser.setModel(model);
        parser.run();

        

        
    }
    
}
