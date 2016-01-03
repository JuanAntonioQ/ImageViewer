package control;

import view.ImageDisplay;

public class PrevImageCommand {

    private final ImageDisplay imageDisplay;
    
    public PrevImageCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }
    
    public void execute(){
        imageDisplay.show(imageDisplay.image().prev());
    }
    
}
