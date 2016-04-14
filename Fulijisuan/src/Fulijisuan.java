import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class Fulijisuan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField jTextField0;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;

	private JButton jButton0;
	private JButton jButton1;

	public Fulijisuan() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJTextField0(), new Constraints(new Leading(121, 132, 10, 10), new Leading(26, 38, 10, 10)));
		add(getJTextField1(), new Constraints(new Leading(121, 132, 10, 10), new Leading(85, 41, 10, 10)));
		add(getJTextField2(), new Constraints(new Leading(121, 132, 10, 10), new Leading(148, 39, 10, 10)));
		add(getJLabel0(), new Constraints(new Leading(59, 44, 12, 12), new Leading(30, 31, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(55, 43, 10, 10), new Leading(85, 40, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(62, 12, 12), new Leading(146, 39, 10, 10)));
		add(getJLabel3(), new Constraints(new Leading(59, 10, 10), new Leading(216, 37, 12, 12)));
		add(getJComboBox1(), new Constraints(new Leading(323, 120, 10, 10), new Leading(128, 31, 10, 10)));
		add(getJTextField3(), new Constraints(new Leading(121, 132, 10, 10), new Leading(216, 41, 10, 10)));
		add(getJRadioButton0(), new Constraints(new Leading(326, 10, 10), new Leading(197, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(124, 10, 10), new Leading(290, 10, 10)));
		add(getJButton2(), new Constraints(new Leading(233, 10, 10), new Leading(292, 10, 10)));
		add(getJComboBox0(), new Constraints(new Leading(323, 120, 10, 10), new Leading(67, 32, 10, 10)));
		setSize(460, 374);
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("清除");
			jButton2.addMouseListener(new MouseAdapter() {

				public void mouseClicked(MouseEvent event) {
					jButton1MouseMouseClicked(event);
				}
			});
		}
		return jButton2;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("计算");
			jButton0.addMouseListener(new MouseAdapter() {

				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JRadioButton getJRadioButton0() {
		if (jRadioButton0 == null) {
			jRadioButton0 = new JRadioButton();
			jRadioButton0.setSelected(false);
			jRadioButton0.setText("定投");
			jRadioButton0.addMouseListener(new MouseAdapter() {

				public void mouseClicked(MouseEvent event) {
					jRadioButton0MouseMouseClicked(event);
				}
			});
		}
		return jRadioButton0;
	}

	private JComboBox getJComboBox1() {
		if (jComboBox1 == null) {
			jComboBox1 = new JComboBox();
			jComboBox1.setModel(new DefaultComboBoxModel(new Object[] { "复利计算",
					"单利计算" }));
			jComboBox1.setDoubleBuffered(false);
			jComboBox1.setBorder(null);
		}
		return jComboBox1;
	}

	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "求本息和",
					"求本金", "求利率", "求年数 ", "求等额本息还款" }));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
			jComboBox0.addMouseListener(new MouseAdapter() {
			});
		}
		return jComboBox0;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("本息");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("年限");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("年利率");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("本金");
		}
		return jLabel0;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		jTextField3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {

				int keyChar = e.getKeyChar();
				if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9
						|| keyChar == '.') {

				} else {
					e.consume();

				}
			}
		});
		return jTextField3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		jTextField2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {

				int keyChar = e.getKeyChar();
				if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9
						|| keyChar == '.') {

				} else {
					e.consume();

				}
			}
		});
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		jTextField1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {

				int keyChar = e.getKeyChar();
				if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9
						|| keyChar == '.') {

				} else {
					e.consume();

				}
			}
		});
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {

					int keyChar = e.getKeyChar();
					if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9
							|| keyChar == '.') {

					} else {
						e.consume();

					}
				}
			});
		}
		return jTextField0;
	}

	private static void jiemian() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	boolean y = false;
	String key2;
	private JComboBox jComboBox0;

	private JRadioButton jRadioButton0;

	private JComboBox jComboBox1;

	private JButton jButton2;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public static void main(String[] args) {
		jiemian();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Fulijisuan frame = new Fulijisuan();
				frame.setDefaultCloseOperation(Fulijisuan.EXIT_ON_CLOSE);
				frame.setTitle("Fulijisuan");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	public void jButton0MouseMouseClicked(MouseEvent event) {
		String key1;
		boolean canplay = false;
		String b, c, d;
		double i = 0, n = 0, p = 0, f = 0;
		key1 = (String) jComboBox0.getSelectedItem();
		key2 = (String) jComboBox1.getSelectedItem();
		if (key1 == "求本息和") {
			b = String.valueOf(jTextField1.getText());
			c = String.valueOf(jTextField2.getText());
			d = String.valueOf(jTextField0.getText());
			if (b.length() > 0 && c.length() > 0 && d.length() > 0) {
				i = Double.parseDouble(jTextField1.getText());
				n = Double.parseDouble(jTextField2.getText());
				p = Double.parseDouble(jTextField0.getText());
				canplay = deposit(i, n, p);
			}

		} else if (key1 == "求本金") {
			b = String.valueOf(jTextField1.getText());
			c = String.valueOf(jTextField2.getText());
			d = String.valueOf(jTextField3.getText());
			if (b.length() > 0 && c.length() > 0 && d.length() > 0) {
				i = Double.parseDouble(jTextField1.getText());
				n = Double.parseDouble(jTextField2.getText());
				f = Double.parseDouble(jTextField3.getText());
				canplay = principal(i, n, f);
			}
		} else if (key1 == "求利率") {
			b = String.valueOf(jTextField0.getText());
			c = String.valueOf(jTextField2.getText());
			d = String.valueOf(jTextField3.getText());
			if (b.length() > 0 && c.length() > 0 && d.length() > 0) {
				p = Double.parseDouble(jTextField0.getText());
				n = Double.parseDouble(jTextField2.getText());
				f = Double.parseDouble(jTextField3.getText());
				canplay = interest(p, n, f);
			}
		} else if (key1 == "求年数 ") {
			b = String.valueOf(jTextField0.getText());
			c = String.valueOf(jTextField1.getText());
			d = String.valueOf(jTextField3.getText());
			if (b.length() > 0 && c.length() > 0 && d.length() > 0) {
				p = Double.parseDouble(jTextField0.getText());
				i = Double.parseDouble(jTextField1.getText());
				f = Double.parseDouble(jTextField3.getText());
				canplay = year(p, i, f);
			}
		} else if (key1 == "求等额本息还款") {
			b = String.valueOf(jTextField0.getText());
			c = String.valueOf(jTextField1.getText());
			d = String.valueOf(jTextField2.getText());
			if (b.length() > 0 && c.length() > 0 && d.length() > 0) {
				p = Double.parseDouble(jTextField0.getText());
				i = Double.parseDouble(jTextField1.getText());
				n = Double.parseDouble(jTextField2.getText());
				canplay = loan(p, i, n);
			}
		}
		if (canplay == false) {
			JOptionPane.showMessageDialog(null, "请输入正确的数字！");
		}
	}

	public void jButton1MouseMouseClicked(MouseEvent event) {
		this.jTextField0.setText(null);
		this.jTextField1.setText(null);
		this.jTextField2.setText(null);
		this.jTextField3.setText(null);
	}

	public void jRadioButton0MouseMouseClicked(MouseEvent event) {
		if (y == false)
			y = true;
		else
			y = false;
	}

	public boolean deposit(double i, double n, double p) {
		double f = 0;
		if (i > 0 && n > 0 && p > 0) {
			if (n > 200)
				return false;
			if (key2 == "复利计算") {
				if (y == true) {
					double p2 = p;
					for (int a = 0; a < n; a++) {
						p = p + f;
						f = p * (1 + i);
					}

				} else {
					double s = 1;
					for (int a = 0; a < n; a++) {

						s = s * (1 + i);
					}
					f = p * s;

				}
			} else {
				if (y == true) {

					f = p * n *( i * n+ 1);
				} else {

					f = p * (i * n + 1);
				}
			}
			this.jTextField3.setText(String.format("%.2f", f));
			return true;
		} else
			return false;
	}

	public boolean principal(double i, double n, double f) {
		double p = 0, s = 1;
		if (i > 0 && n > 0 && f > 0) {
			if (n > 200)
				return false;
			if (key2 == "复利计算") {
				for (int a = 0; a < n; a++) {
					s = (i + 1) * s;
				}
				p = f * (1 / s);

			} else {
				p = f * (1 / (1 + i * n));

			}
			this.jTextField0.setText(String.format("%.2f", p));

			return true;
		} else
			return false;
	}

	public boolean interest(double p, double n, double f) {
		double i = 0;
		if (f > 0 && n > 0 && p > 0) {
			if (n > 200)
				return false;
			if (key2 == "复利计算") {
				i = Math.pow(f / p, 1.0 / n) - 1;

			} else {
				i = (f - p) / (p * n);

			}
			this.jTextField1.setText(String.format("%.2f", i));

			return true;
		} else
			return false;
	}

	public boolean year(double p, double i, double f) {
		double n = 0;

		if (i > 0 && f > 0 && p > 0) {
			if (key2 == "复利计算") {
				n = Logarithm.log(f / p, 1 + i);

			} else {
				n = (f - p) / (p * i);

			}
			this.jTextField2.setText(String.format("%.2f", n));
			return true;
		} else
			return false;
	}

	public boolean loan(double p, double i, double n) {
		double f = 0;
		if (n > 200)
			return false;
		if (i > 0 && n > 0 && p > 0) {
			i = i / 12;
			n = n * 12;
			f = p * i * Math.pow(1 + i, n) / (Math.pow(1 + i, n) - 1);

			this.jTextField3.setText(String.format("%.2f", f));
			return true;
		} else
			return false;

	}
}