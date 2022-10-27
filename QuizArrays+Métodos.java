import javax.swing.JOptionPane;

public class QUIZ {

	public static void main(String[] args) {
		int operación = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la operación que deseas hacer:"
				+"\n" + "1. Ver numero mayor"
				+"\n" + "2. Ver numero menor"
				+"\n" + "3. Calcular raiz cuadrada"
				+"\n" + "4. Elevar a una potencía")); 
					
					if (operación==1) {
						mayor();
					}
					if (operación==2) {
						menor();
					}
					if (operación==3) {
						raiz();
					}
					if (operación==4) {
						potencia();
					}
				}
				
				public static void mayor() {
					int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
					int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número:"));
					if (n1>n2) {
						JOptionPane.showMessageDialog(null,n1 + " es mayor que "+n2);
					}
					if (n1==n2) {
						JOptionPane.showMessageDialog(null,"Los dos numeros ingresados son iguales");
					}
					else {
							JOptionPane.showMessageDialog(null,n2 + " es mayor que "+n1);
					}
				}
				public static void menor() {
					int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
					int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número:"));
					if (n1>n2) {
						JOptionPane.showMessageDialog(null,n2 + " es menor que "+n1);
					}
					if (n1==n2) {
						JOptionPane.showMessageDialog(null,"Los dos numeros ingresados son iguales");
					}
					else {
							JOptionPane.showMessageDialog(null,n1 + " es menor que "+n2);
					}
				}
				public static void raiz() {
					double n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radiando:"));
					double rta = Math.sqrt(n1);
					JOptionPane.showMessageDialog(null, "La raiz cuadrada de "+n1+" es "+rta);
				}
				
				public static void potencia() {
					double n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base:"));
					double n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el exponente:"));
					double rta = Math.pow(n1,n2);
					JOptionPane.showMessageDialog(null, n1+" elevado a la potencia "+n2+" es "+rta);
	            }

}
