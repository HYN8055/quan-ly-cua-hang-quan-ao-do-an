
package doanjava.nhom6.qlchbqa.main;
import doanjava.nhom6.qlchbqa.view.MainJFrame;
/*import doanjava.nhom6.qlchbqa.view.DangnhapJDialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;*/

/**
 *
 * @author hyn09
 */
public class Main {
    public static void main(String[] args) {
    new MainJFrame().setVisible(true);
    /*DangnhapJDialog dialog= new DangnhapJDialog(null,true);
    dialog.setTitle("Đăng nhập hệ thống");
    dialog.setResizable(false);
    dialog.setLocationRelativeTo(null);
    dialog.setVisible(true);
   
    dialog.getBtnDangNhap().addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
                // Kiểm tra sự kiện nhấp chuột trái
                  dialog.setVisible(false); // Ẩn dialog đăng nhập
                  new MainJFrame().setVisible(true); // Hiển thị MainJFrame
        
          }
    });*/
}
}
