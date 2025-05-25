import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.*;

public class GroovyFrame extends JFrame implements ActionListener {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private GroovyBot groovy;

    public GroovyFrame() {
        groovy = new GroovyBot();

        setTitle("Groovy ChatBot");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.addActionListener(this); // Enter key handling
        sendButton = new JButton("Send");
        sendButton.addActionListener(this);

        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        add(inputPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userText = inputField.getText();
        if (!userText.isEmpty()) {
            chatArea.append("👤 You: " + userText + "\n");
            String response = groovy.getResponse(userText);
            chatArea.append("🤖 Groovy: " + response + "\n\n");
            inputField.setText("");

            Pattern pattern = Pattern.compile("https?://\\S+");
            Matcher matcher = pattern.matcher(response);
            if (matcher.find()) {
                try {
                    Desktop.getDesktop().browse(new java.net.URI(matcher.group()));
                } catch (Exception ex) {
                    chatArea.append("Failed to open link.\n");
                }
            }
        }
    }
}
