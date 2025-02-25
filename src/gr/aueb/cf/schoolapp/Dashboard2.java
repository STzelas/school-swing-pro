package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JButton;

public class Dashboard2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public Dashboard2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 1033, 57);
		contentPane.add(header);
		
		JLabel govImage = new JLabel("");
		govImage.setIcon(new ImageIcon(Dashboard2.class.getResource("/images/gov_logo_small.png")));
		govImage.setHorizontalAlignment(SwingConstants.CENTER);
		govImage.setBounds(0, 0, 113, 57);
		header.add(govImage);
		
		JLabel lblHomePage_3_1_1 = new JLabel("SOTIRIS TZELATIDIS");
		lblHomePage_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHomePage_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePage_3_1_1.setForeground(Color.WHITE);
		lblHomePage_3_1_1.setBounds(809, 11, 214, 34);
		header.add(lblHomePage_3_1_1);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(192, 192, 192));
		footer.setLayout(null);
		footer.setBounds(0, 534, 1033, 85);
		contentPane.add(footer);
		
		JLabel lblSupport = new JLabel("Εγχειρίδιο Χρήσης");
		lblSupport.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSupport.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupport.setForeground(new Color(0, 0, 179));
		lblSupport.setBounds(752, 25, 108, 33);
		footer.add(lblSupport);
		
		JLabel lblQuestions = new JLabel("Συχνές Ερωτήσεις");
		lblQuestions.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQuestions.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestions.setForeground(new Color(0, 0, 179));
		lblQuestions.setBounds(473, 25, 108, 33);
		footer.add(lblQuestions);
		
		JLabel lblManual = new JLabel("Υποστήριξη Πολιτών");
		lblManual.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblManual.setHorizontalAlignment(SwingConstants.CENTER);
		lblManual.setForeground(new Color(0, 0, 179));
		lblManual.setBounds(171, 25, 131, 33);
		footer.add(lblManual);
		
		JPanel nav = new JPanel();
		nav.setLayout(null);
		nav.setBackground(new Color(0, 52, 117));
		nav.setBounds(0, 56, 192, 478);
		contentPane.add(nav);
		
		JLabel lblHomePage = new JLabel("Αρχική");
		lblHomePage.setBackground(new Color(255, 255, 255));
		lblHomePage.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHomePage.setBounds(22, 22, 120, 33);
		nav.add(lblHomePage);
		lblHomePage.setHorizontalAlignment(SwingConstants.LEFT);
		lblHomePage.setForeground(new Color(255, 255, 255));
		
		JLabel lblTeachersPage = new JLabel("Εκπαιδευτές");
		lblTeachersPage.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTeachersPage.setHorizontalAlignment(SwingConstants.LEFT);
		lblTeachersPage.setForeground(new Color(255, 255, 0));
		lblTeachersPage.setBounds(22, 51, 120, 33);
		nav.add(lblTeachersPage);
		
		JLabel lblInsertTeacher = new JLabel("Εισαγωγή εκπαιδευτή");
		lblInsertTeacher.setHorizontalAlignment(SwingConstants.LEFT);
		lblInsertTeacher.setForeground(Color.WHITE);
		lblInsertTeacher.setBounds(32, 106, 136, 34);
		nav.add(lblInsertTeacher);
		
		JLabel lblShowTeacher = new JLabel("Προβολή εκπαιδευτών");
		lblShowTeacher.setHorizontalAlignment(SwingConstants.LEFT);
		lblShowTeacher.setForeground(Color.WHITE);
		lblShowTeacher.setBounds(32, 78, 136, 34);
		nav.add(lblShowTeacher);
		
		JLabel lblQuality = new JLabel("Ποιότητα στην Εκπαίδευση");
		lblQuality.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuality.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblQuality.setBounds(386, 68, 415, 78);
		contentPane.add(lblQuality);
		
		JLabel lblShowRecord = new JLabel("Προβολή Μητρώου Εκπαιδευτών");
		lblShowRecord.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblShowRecord.setBounds(280, 190, 346, 21);
		contentPane.add(lblShowRecord);
		
		JLabel lblRecordMessage = new JLabel("Προβολή Μητρώου Εγγεγραμένων Εκπαιδευτών στο Μητρώο του Coding Factory");
		lblRecordMessage.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRecordMessage.setBounds(280, 210, 540, 31);
		contentPane.add(lblRecordMessage);
		
		JLabel lblInsertRecord = new JLabel("Εισαγωγή Εκπαιδευτή στο Μητρώο Εκπαιδευτών");
		lblInsertRecord.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInsertRecord.setBounds(280, 365, 481, 21);
		contentPane.add(lblInsertRecord);
		
		JButton btnConnect = new JButton("Σύνδεση");
		btnConnect.setForeground(Color.WHITE);
		btnConnect.setEnabled(false);
		btnConnect.setBackground(new Color(0, 136, 0));
		btnConnect.setBounds(280, 252, 113, 46);
		contentPane.add(btnConnect);
		
		JButton btnConnect_2 = new JButton("Σύνδεση");
		btnConnect_2.setForeground(Color.WHITE);
		btnConnect_2.setEnabled(false);
		btnConnect_2.setBackground(new Color(0, 136, 0));
		btnConnect_2.setBounds(280, 439, 113, 46);
		contentPane.add(btnConnect_2);
		
		JLabel lblInsertMessage = new JLabel("Εισαγωγή Εκπαιδευτή στο μητρώο του Coding Factory");
		lblInsertMessage.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInsertMessage.setBounds(280, 397, 540, 31);
		contentPane.add(lblInsertMessage);
	}
}
