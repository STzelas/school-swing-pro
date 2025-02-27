package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ViewPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblName;
	private JLabel lblTaxNo;
	private JLabel lblPhoneNumber;
	private JLabel lblAddress;
	private JLabel lblCity;
	private JLabel lblLastname;
	private JLabel lblFatherName;
	private JLabel lblEmail;
	private JLabel lblAddressNo;
	private JLabel lblZipNo;
	private JSeparator separator;

	
	public ViewPage() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1049, 862);
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
		govImage.setIcon(new ImageIcon(ViewPage.class.getResource("/images/gov_logo_small.png")));
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
		footer.setBounds(0, 738, 1033, 85);
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
		
		JButton btnClose = new JButton("Κλείσιμο");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getViewpage().setVisible(false);
				Main.getViewpage().setEnabled(false);
				Main.getShowTeacherPage().setEnabled(true);
				Main.getShowTeacherPage().setVisible(true);
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(new Color(192, 192, 192));
		btnClose.setBounds(772, 651, 220, 50);
		contentPane.add(btnClose);
		
		JLabel lblTeacherInfo = new JLabel("Στοιχεία Εκπαιδευτή");
		lblTeacherInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeacherInfo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTeacherInfo.setBounds(340, 76, 351, 57);
		contentPane.add(lblTeacherInfo);
		
		lblName = new JLabel("Όνομα :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblName.setBounds(114, 171, 46, 14);
		contentPane.add(lblName);
		
		lblTaxNo = new JLabel("Α.Φ.Μ. :");
		lblTaxNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTaxNo.setBounds(114, 252, 67, 14);
		contentPane.add(lblTaxNo);
		
		lblPhoneNumber = new JLabel("Τηλέφωνο :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPhoneNumber.setBounds(114, 332, 67, 14);
		contentPane.add(lblPhoneNumber);
		
		lblAddress = new JLabel("Διεύθυνση :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAddress.setBounds(114, 410, 67, 14);
		contentPane.add(lblAddress);
		
		lblCity = new JLabel("Πόλη:");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCity.setBounds(114, 492, 46, 14);
		contentPane.add(lblCity);
		
		lblLastname = new JLabel("Επώνυμο :");
		lblLastname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLastname.setBounds(569, 172, 67, 14);
		contentPane.add(lblLastname);
		
		lblFatherName = new JLabel("Πατρώνυμο :");
		lblFatherName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFatherName.setBounds(569, 252, 78, 14);
		contentPane.add(lblFatherName);
		
		lblEmail = new JLabel("e-mail :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(569, 332, 46, 14);
		contentPane.add(lblEmail);
		
		lblAddressNo = new JLabel("Αριθμός :");
		lblAddressNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAddressNo.setBounds(569, 410, 58, 14);
		contentPane.add(lblAddressNo);
		
		lblZipNo = new JLabel("Τ.Κ. :");
		lblZipNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblZipNo.setBounds(569, 492, 37, 14);
		contentPane.add(lblZipNo);
		
		JButton btnPrint = new JButton("Εκτύπωση");
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setBackground(new Color(0, 125, 63));
		btnPrint.setBounds(772, 590, 220, 50);
		contentPane.add(btnPrint);
		
		separator = new JSeparator();
		separator.setBounds(74, 300, 798, 2);
		contentPane.add(separator);
	}
	
	private void FetchTeacherFromDatabase(String uuid) {
		
	}
}
