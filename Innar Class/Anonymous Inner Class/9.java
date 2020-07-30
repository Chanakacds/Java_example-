import java.awt.*;
import java.awt.event.*;
class Test {
	public static void main(String[] args){
		Frame f = new Frame();
		f.setSize(300,400);
		f.setVisible(true);
		
		Button b1 = new Button("click me");
		f.add(b1);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("button is clicked");
				System.exit(0);
			}
		});
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				for(int i=1;i<=10;i++){
					System.out.println(i);
				}
				System.exit(0);
			}
		});
	}
}
