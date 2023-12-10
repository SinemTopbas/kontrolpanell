//Sinem TOPBAŞ   1220505026

// Swing kütüphanesinden gerekli sınıfları içe aktar
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

// JButton sınıfından türetilmiş ButtonControlPanel sınıfı
public class ButtonControlPanel extends JButton {

    // Aktif buton ve buton listesi için sınıf değişkenleri
    private static ButtonControlPanel activeButton = null;
    private static List<ButtonControlPanel> buttonList = new ArrayList<>();

    // Butonun durumunu ve özelliklerini tutan sınıf değişkenleri
    private String graphQLSchemaAddress;
    private Image activeImage;
    private Image inactiveImage;
    private Color activeColor;
    private Color inactiveColor;
    private boolean isActive;

    // ButtonControlPanel sınıfının kurucu metodu
    public ButtonControlPanel(String text, String graphQLSchemaAddress, Image activeImage, Image inactiveImage,
                              Color activeColor, Color inactiveColor) {
        // JButton sınıfının kurucu metodunu çağır ve gerekli özellikleri ayarla
        super(text);
        this.graphQLSchemaAddress = graphQLSchemaAddress;
        this.activeImage = resizeImage(activeImage, 50, 50); // Resmi boyutlandır
        this.inactiveImage = resizeImage(inactiveImage, 50, 50); // Resmi boyutlandır
        this.activeColor = activeColor;
        this.inactiveColor = inactiveColor;
        this.isActive = false; // Buton başlangıçta pasif durumda

        initializeButton(); // Butonun özelliklerini başlatan metod
        buttonList.add(this); // Oluşturulan butonu listeye ekle
    }

    // Butonun özelliklerini başlatan metod
    private void initializeButton() {
        setForeground(inactiveColor); // Yazı rengini pasif renge ayarla
        setIcon(new ImageIcon(inactiveImage)); // İkonu pasif resimle ayarla

        // Butona tıklandığında çalışacak olan olay dinleyici
        addActionListener(e -> {
            changeButtonState(); // Buton durumunu değiştiren metod
            executeGraphQLMutation(); // GraphQL mutasyonunu çalıştıran metod
        });
    }

    // Buton durumunu değiştiren metod
    private void changeButtonState() {
        if (isActive) {
            // Eğer buton zaten aktifse, tüm butonları pasif hale getir
            for (ButtonControlPanel button : buttonList) {
                button.isActive = false;
                button.setForeground(button.inactiveColor);
                button.setIcon(new ImageIcon(button.inactiveImage));
            }
            activeButton = null; // Aktif butonu null olarak ayarla
        } else {
            // Eğer başka bir buton aktifse, onu pasif hale getir ve bu butonu aktif yap
            if (activeButton != null && activeButton != ButtonControlPanel.this) {
                activeButton.isActive = true;
                activeButton.setForeground(activeButton.activeColor);
                activeButton.setIcon(new ImageIcon(activeButton.activeImage));
            }
            setActiveState(); // Butonu aktif hale getiren metod
        }
    }

    // GraphQL mutasyonunu çalıştıran metod
    private void executeGraphQLMutation() {
        System.out.println("Executing GraphQL mutation at this address: " + graphQLSchemaAddress);
        if (isActive) {
            // Eğer buton aktifse, belirtilen şema adresinde GraphQL mutasyonunu çalıştır
        }
    }

    // Butonu aktif hale getiren metod
    private void setActiveState() {
        setForeground(activeColor); // Yazı rengini aktif renge ayarla
        setIcon(new ImageIcon(activeImage)); // İkonu aktif resimle ayarla
        activeButton = ButtonControlPanel.this; // Aktif butonu güncelle
    }

    // Resmi belirtilen genişlik ve yüksekliğe boyutlandıran metod
    private Image resizeImage(Image image, int width, int height) {
        return image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    // JFrame'in boyutunu ayarlayan ve görünür hale getiren metod
    private static void setupAndDisplayFrame(JFrame frame) {
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Ana metod, programın başladığı yer
    public static void main(String[] args) {
        // Aktif ve pasif resimlerin dosya yolları
        ImageIcon activeImage = new ImageIcon("C:/Users/PC/Desktop/HTML/pandaa.png");
        ImageIcon inactiveImage = new ImageIcon("C:/Users/PC/Desktop/HTML/desktop-wallpaper-90s-anime-aesthetic-laptop-anime-aesthetic-laptop.jpg");

        // JFrame oluşturuluyor
        JFrame frame = new JFrame("Button Control Panel");
        frame.setLayout(new GridLayout(4, 4));

        // 4x4'lük bir buton gridi oluşturuluyor
        for (int i = 0; i < 16; i++) {
            // Her bir buton oluşturuluyor ve JFrame'e ekleniyor
            ButtonControlPanel button = new ButtonControlPanel("Button " + (i + 1),
                    "http://new.abb.com", activeImage.getImage(), inactiveImage.getImage(),
                    Color.PINK, Color.GRAY);
            frame.add(button);
        }

        // JFrame'in boyutunu ayarlayan ve görünür hale getiren metod
        setupAndDisplayFrame(frame);
    }
}
