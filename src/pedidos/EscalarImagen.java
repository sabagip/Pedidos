/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pedidos;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author SABAGIP
 */
public class EscalarImagen {

    protected EscalarImagen(String ruta, JLabel etiqueta) {
         
        
         ImageIcon imagen = new ImageIcon(getClass().getResource(ruta));
         Image imagenEscalada = imagen.getImage().getScaledInstance(etiqueta.getWidth(),
         //Image imagenEscalada = new ImageIcon(ruta).getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), hints);
         etiqueta.getHeight(), Image.SCALE_SMOOTH);
         Icon iconoEscalado = new ImageIcon(imagenEscalada);
         etiqueta.setIcon(iconoEscalado);
    }
    
}
