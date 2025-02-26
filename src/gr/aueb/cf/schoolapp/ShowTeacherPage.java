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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

public class ShowTeacherPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textLastnameSearch;
	private JTable table;
	private JTable table_1;

	
	public ShowTeacherPage() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1049, 771);
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
		govImage.setIcon(new ImageIcon(ShowTeacherPage.class.getResource("/images/gov_logo_small.png")));
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
		footer.setBounds(0, 647, 1033, 85);
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
		
		JLabel lblQuality = new JLabel("Αιτήσεις Εκπαιδευτών");
		lblQuality.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuality.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblQuality.setBounds(309, 68, 415, 78);
		contentPane.add(lblQuality);
		
		JButton btnShow = new JButton("Προβολή");
		btnShow.setForeground(Color.WHITE);
		btnShow.setBackground(new Color(0, 136, 0));
		btnShow.setBounds(816, 290, 183, 46);
		contentPane.add(btnShow);
		
		JButton btnEdit = new JButton("Επεξεργασία");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setBackground(new Color(0, 136, 0));
		btnEdit.setBounds(816, 347, 183, 46);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Διαγραφή");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(new Color(0, 136, 0));
		btnDelete.setBounds(816, 403, 183, 46);
		contentPane.add(btnDelete);
		
		JButton btnClose = new JButton("Κλείσιμο");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getShowTeacherPage().setVisible(false);
				Main.getShowTeacherPage().setEnabled(false);
				Main.getDashboard().setEnabled(true);
				Main.getDashboard().setVisible(true);
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(new Color(192, 192, 192));
		btnClose.setBounds(816, 579, 183, 57);
		contentPane.add(btnClose);
		
		JButton btnSearch = new JButton("Αναζήτηση");
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(new Color(0, 136, 0));
		btnSearch.setBounds(332, 157, 183, 46);
		contentPane.add(btnSearch);
		
		JButton btnClearAll = new JButton("Εκκαθάριση");
		btnClearAll.setForeground(Color.WHITE);
		btnClearAll.setBackground(new Color(120, 201, 209));
		btnClearAll.setBounds(525, 157, 183, 46);
		contentPane.add(btnClearAll);
		
		textLastnameSearch = new JTextField();
		textLastnameSearch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textLastnameSearch.setBounds(126, 157, 183, 46);
		contentPane.add(textLastnameSearch);
		textLastnameSearch.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Επώνυμο");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(60, 172, 56, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(210, 210, 210)));
		scrollPane.setBounds(60, 240, 665, 396);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u039A\u03C9\u03B4\u03B9\u03BA\u03CC\u03C2", "\u038C\u03BD\u03BF\u03BC\u03B1", "\u0395\u03C0\u03AF\u03B8\u03B5\u03C4\u03BF"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(236);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(174);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(208);
		scrollPane.setViewportView(table_1);
	
	}
}
