import javax.swing.*;
import javax.swing.BorderFactory;

public class Window extends JFrame {

    private JPanel p;
    private WorkList WorkList;

    public Window(){
        WorkList = new WorkList();
        windowConfig();
        setVisible(true);
        setTitle("Tarefas");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void windowConfig() {
        p = new JPanel();
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(p);

        JLabel label = new JLabel("Caixa de entrada");

        JButton newButton = new JButton("Nova Tarefa");

        p.add(label);

        p.add(Box.createVerticalStrut(15));

        p.add(newButton);

        p.add(Box.createVerticalStrut(15));

        newList();

        add(scrollPane);
    }

    private void newList(){
        for(String s : WorkList.ListCount()){
            p.add(newItem());
        }
    }

    private JPanel newItem(){
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEtchedBorder());

        JCheckBox checkbox = new JCheckBox("Comprar Carvão");

        panel.add(checkbox);
        
        return panel;
    }
}
