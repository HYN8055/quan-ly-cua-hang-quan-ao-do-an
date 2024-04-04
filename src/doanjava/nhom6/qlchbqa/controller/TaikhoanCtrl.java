
package doanjava.nhom6.qlchbqa.controller;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
/**
 *
 * @author hyn09
 */
public class TaikhoanCtrl {
    private JDialog dialog;
    private JButton buttonsub;
    private JTextField jtxttendangnhap;
    private JTextField jtxtmatkhau;
    private JLabel jlbmess;

    public TaikhoanCtrl(JDialog dialog, JButton buttonsub, JTextField jtxttendangnhap, JTextField jtxtmatkhau, JLabel jlbmess) {
        this.dialog = dialog;
        this.buttonsub = buttonsub;
        this.jtxttendangnhap = jtxttendangnhap;
        this.jtxtmatkhau = jtxtmatkhau;
        this.jlbmess = jlbmess;
    }
    public void setEvent(){
        buttonsub.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(jtxttendangnhap.getText().length() == 0 || jtxtmatkhau.getText().length() == 0){
                    jlbmess.setText("Vui lòng nhập tên và mật khẩu đăng nhập!");    
                }
                else{
                    
                }
            }
            @Override
            public void mouseEntered(MouseEvent e){
                buttonsub.setBackground(new Color (225,225,225));
            }
            @Override
            public void mouseExited(MouseEvent e){
                buttonsub.setBackground(new Color (100,221,100));
            }
    });
    }
}
