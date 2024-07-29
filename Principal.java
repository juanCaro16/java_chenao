import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double valorSemilla=0, valorPagar=0;
		int cantSemilla=0;
	
		String menuPrincipal="MENU PRINCIPAL\n\n";
		menuPrincipal+="1. TOMATE\n";
		menuPrincipal+="2. REPOLLO\n";
		menuPrincipal+="3. PAPA\n";
		menuPrincipal+="4. CEBOLLA\n";
		menuPrincipal+="5. SALIR\n\n";
		menuPrincipal+="Ingrese una opcion\n";
		
		
		String menuTomate="MENU TOMATE\n\n";
		menuTomate+="1. Chonto\n";
		menuTomate+="2. Ensalada\n";
		menuTomate+="Ingrese una opcion para el tomate\n";
		
		String menuPapa="MENU PAPA\n\n";
		menuPapa+="1. Criolla\n";
		menuPapa+="2. Pastusa\n";
		menuPapa+="3. Salentuna\n";
		menuPapa+="Ingrese una opcion para la papa\n";
		
		String menuCebolla="MENU PAPA\n\n";
		menuCebolla+="1. Cebolla Larga\n";
		menuCebolla+="2. Cebolla De Huevo\n";
		menuCebolla+="Ingrese una opcion para la Cebolla\n";
		
		int opc=0;
		do {
			
			opc=Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
			
			if (opc!=5) 
				
				/*cantSemilla=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de semillas requeridas"));*/
			
			
			switch (opc) {
			case 1: 
				System.out.println("TOMATE");
				int opc2=Integer.parseInt(JOptionPane.showInputDialog(menuTomate));
				
					switch (opc2) {
					case 1:
							System.out.println("Tomate Chonto");
							valorSemilla=15;
						break;
					case 2:
						System.out.println("Tomate Ensalada");
						valorSemilla=20;
						break;
					default:System.out.println("No existe ese tipo de tomate");
						break;
					}
					cantSemilla=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de semillas requeridas"));
					
				break;
			case 2: System.out.println("REPOLLO");	
					valorSemilla=10;
					cantSemilla=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de semillas requeridas"));
					break;
			case 3: System.out.println("PAPA");	
			
			int opc3=Integer.parseInt(JOptionPane.showInputDialog(menuPapa));
			
			switch (opc3) {
			
			case 1:
					System.out.println("Papa Criolla");
					valorSemilla=8;
				break;
			case 2:
				System.out.println("Papa Pastusa");
				valorSemilla=9;
				break;
			case 3:
				System.out.println("Papa Salentuna");
				valorSemilla=11;
				break;
			default:System.out.println("No existe ese tipo de papa");
				break;
			}
			cantSemilla=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de semillas requeridas"));
			
			break;
			case 4: System.out.println("CEBOLLA");
			
			int opc4=Integer.parseInt(JOptionPane.showInputDialog(menuCebolla));
			
			switch (opc4) {
			
			case 1:
					System.out.println("Cebolla Larga");
					valorSemilla=15;
				break;
			case 2:
				System.out.println("Cebolla De Huevo");
				valorSemilla=13;
				break;
			
			default:System.out.println("No existe ese tipo de cebolla");
				break;
			}
			cantSemilla=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de semillas requeridas"));
			
			break;
			case 5: JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
					break;
			default: System.out.println("No existe la opcion");
				break;
			}
			
			if (opc!=5) {
				valorPagar=cantSemilla*valorSemilla;
				JOptionPane.showMessageDialog(null,"El valor a pagar es: "+valorPagar);
			}
				
			
			
		} while (opc!=5);
		
		
		
	}

}
