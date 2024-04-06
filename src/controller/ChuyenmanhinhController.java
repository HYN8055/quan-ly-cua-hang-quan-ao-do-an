
package doanjava.nhom6.qlchbqa.controller;
import doanjava.nhom6.qlchbqa.view.TrangChuJPanel;
import doanjava.nhom6.qlchbqa.view.SanPhamJPanel;
import doanjava.nhom6.qlchbqa.bean.Danhmucbean;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.util.*;
import java.awt.event.*;

/**
 *
 * @author hyn09
 */
public class ChuyenmanhinhController {
    private JPanel root;
    private String kindSelected = "";
    
    private List<Danhmucbean> listItem= null;

    public ChuyenmanhinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected="TrangChu";
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<Danhmucbean> listItem){
        this.listItem = listItem;
        for(Danhmucbean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener{
        
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind){
                case "TrangChu" -> node = new TrangChuJPanel();
                case "SanPham" -> node=new SanPhamJPanel();
                default -> {
                    node = new TrangChuJPanel();
                }
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(125,125,125));
            jlbItem.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(255, 255, 255));
            jlbItem.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(152,205,205));
                jlbItem.setBackground(new Color(152,205,205));
            }
        }
        
        
    }
    
    private void setChangeBackground(String kind){
        for (Danhmucbean item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(255, 255, 255));
                item.getJlb().setBackground(new Color(255, 255, 255));
            }else{
                item.getJpn().setBackground(new Color(152,205,205));
                item.getJlb().setBackground(new Color(152,205,205));
            }
    }
    }
            
}
