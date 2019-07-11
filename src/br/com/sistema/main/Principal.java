package br.com.sistema.main;

import br.com.sistema.model.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Cliente 1");
		String nome = JOptionPane.showInputDialog("Informe o nome do Cliente");
		String telefone = JOptionPane.showInputDialog("Informe o telefone dop Cliente");
		String email = JOptionPane.showInputDialog("Informe o email do Cliente");
		String nomeCidade = JOptionPane.showInputDialog("Informe a cidade");
		String uf = JOptionPane.showInputDialog("Informe o estado");
		
		Cliente c1 = new Cliente(nome);
		c1.setEmail(email);
		c1.setTelefone(telefone);
		
		Cidade  cidade1 = new Cidade(nomeCidade);
		cidade1.setNomeCidade(nomeCidade);
		cidade1.setUf(uf);
		
		c1.setCidade(cidade1);
		
		
		
		//-----------------
		
		JOptionPane.showMessageDialog(null, "Cliente 2");
		nome = JOptionPane.showInputDialog("Informe o nome do Cliente");
		telefone = JOptionPane.showInputDialog("Informe o telefone dopping Cliente");
		email = JOptionPane.showInputDialog("Informe o email do Cliente");
		nomeCidade = JOptionPane.showInputDialog("Informe a cidade");
		uf = JOptionPane.showInputDialog("Informe o estado");
		
		Cliente c2 = new Cliente(nome);
		c2.setEmail(email);
		c2.setTelefone(telefone);
		
		Cidade  cidade2 = new Cidade(nomeCidade);
		cidade2.setNomeCidade(nomeCidade);
		cidade2.setUf(uf);
		
		c2.setCidade(cidade2);
		
		ArrayList cidades = new ArrayList<Cliente>();
		cidades.add(c1);
		cidades.add(c2);
		
		JOptionPane.showMessageDialog(null, cidades);
		
	}

}
