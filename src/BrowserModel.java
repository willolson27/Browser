import java.util.Stack;

public class BrowserModel {

	private BrowserView view;
	private Stack<Integer> forward, backStack;
	private int lineNumber;
	
	
	BrowserModel(BrowserView v) {
		view = v;
		home();
	}
	
	public void back() {
		forward.push(lineNumber);
		lineNumber = backStack.pop();
		view.update(lineNumber);
	}
	
	public void forward() {
		
	}
	
	public void home() {
		followLink(0);
		forward.clear();
		backStack.clear();
		
	}
	
	public void followLink(int a) {
		forward.clear();
		backStack.push(lineNumber);
		lineNumber = a;
		view.update(a);
	}
	
	public boolean hasBack() {
		return false;
	}
	  
	
}
