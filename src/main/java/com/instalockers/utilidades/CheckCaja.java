/**
 * @author Jos� Mora
 */
package com.instalockers.utilidades;

import java.awt.Color;

import javax.swing.JCheckBox;

public class CheckCaja extends JCheckBox {
	public CheckCaja(int x, int y, int width, int height) {
		this.setBorder(null);
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
		this.setBackground(Color.WHITE);
		this.setBounds(x, y, width, height);
	}
}
