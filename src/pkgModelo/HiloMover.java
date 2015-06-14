/*
 * Hilo que sirve para mover
 */
package pkgModelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import pkgVista.FrmAtender;

/**
 *
 * @author Estefanía Gómez Cárdenas
 */
public class HiloMover implements Runnable {

    boolean fin;
    int x;
    int y;
    int xinicial;
    int yinicial;
    int xfinal;
    int yfinal;
    int xmedio;
    int tiempo;
    JLabel lbl;
    JProgressBar barra;

    @Override
    public void run() {

        if (x < xmedio && y == yinicial) {
            System.out.println("entró...");
            x += 15;

        } else if (x >= xmedio) {
            if (x <= xfinal) {
                x += 2;
            }
            if (y > yfinal) {
                y -= 15;
            }
            if (y <= yfinal - 10) {
                y += 10;
                //hiloMover.stop();
            }

        }
        if (x >= xfinal && y <= yfinal) {

            //hiloMover.stop();
            System.out.println("__Tiempo " + tiempo);
            if (tiempo >= 0) {
                System.out.println("Tiempo " + tiempo);
                barra.setValue(tiempo);
                tiempo--;
            } else {
                fin = true;
            }

        }
        lbl.setBounds(x, y, 30, 30);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmAtender.class.getName()).log(Level.SEVERE, null, ex);
        }
        //mover(lbl);
        //*********************************************************************MARCELA CLADERON PARA FINALIZAR HILO
        if (!fin) {
            run();
        }

    }

    /**
     * Costructor del hilo, por medio del cual recibe los parámetros
     *
     * @param x posición x del lbl que va a mover
     * @param y posición y del lbl que va a mover
     * @param xinicial posición inicial en x del lbl que va a mover
     * @param yinicial posición inicial en y del lbl que va a mover
     * @param xfinal posición final en x del lbl que va a mover
     * @param yfinal posición final en y del lbl que va a mover
     * @param xmedio posición donde cambia su ruta
     * @param lbl Label que va a mover
     */
    public HiloMover(int x, int y, int xinicial, int yinicial, int xfinal, int yfinal, int xmedio, JLabel lbl) {
        this.x = x;
        this.y = y;
        this.xinicial = xinicial;
        this.yinicial = yinicial;
        this.xfinal = xfinal;
        this.yfinal = yfinal;
        this.xmedio = xmedio;
        this.lbl = lbl;
    }

    //*************************************************************************
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo*2;
    }

    public boolean fin() {
        return true;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

}
