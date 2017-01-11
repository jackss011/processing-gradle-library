package my.processinglib;
import processing.core.*;

public class ProcessingLib
{
  PApplet parent;
  static PApplet app;

  public ProcessingLib(PApplet parent)
  {
    this.parent = parent;
    app = parent;
    parent.registerMethod("dispose", this);

    parent.println("Start");
  }

  public void dispose() {
    // Anything in here will be called automatically when
    // the parent sketch shuts down. For instance, this might
    // shut down a thread used by this library.
    parent.println("Dispose");
  }
}
