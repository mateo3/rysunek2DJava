
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Rysunek extends JFrame {

    public Rysunek() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Obrazek 2D");
        setSize(640, 360);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static class Surface extends JPanel {

        private void doDrawing(Graphics g) {

            Graphics2D g2d = (Graphics2D) g;
            RenderingHints rh = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            rh.put(RenderingHints.KEY_RENDERING,
                    RenderingHints.VALUE_RENDER_QUALITY);

            g2d.setRenderingHints(rh);

            g2d.setPaint(new Color(40,120,240));
            g2d.fillRect(0,0,640,360);

//            g2d.fillRect(30, 20, 50, 50);
//            g2d.fillRect(120, 20, 90, 60);
//            g2d.fillRoundRect(250, 20, 70, 60, 25, 25);
//
//            g2d.fill(new Ellipse2D.Double(10, 100, 80, 100));
            g2d.setPaint(Color.GRAY);
            g2d.fillArc(-39, -40, 295, 245, 240, 60);
            g2d.fillArc(50, -40, 255, 225, 240, 60);
            g2d.fillArc(100, -40, 295, 245, 240, 60);
            g2d.setPaint(new Color(0,235,0));
            g2d.fillRect(0,180,640,170);
            g2d.setPaint(Color.yellow);
            g2d.fillOval(-40, -20, 80, 80);
            int w = 100;
            int h = 100;

            Random r = new Random();

            for (int i = 0; i < 300; i++) {

                int x = Math.abs(r.nextInt()) % w;
                int y = Math.abs(r.nextInt()) % h;
                g2d.drawLine(0, 0, x ,y);
            }
            g2d.setPaint(Color.white);

            g2d.fill(new Ellipse2D.Double(390, 10, 66, 80 ));
            g2d.fill(new Ellipse2D.Double(430, 10, 67, 80 ));
            g2d.fill(new Ellipse2D.Double(460, 10, 68, 80 ));
            g2d.fill(new Ellipse2D.Double(400, 30, 67, 80 ));
            g2d.fill(new Ellipse2D.Double(430, 30, 67, 80 ));
            g2d.fill(new Ellipse2D.Double(460, 20, 68, 80 ));
            g2d.fill(new Ellipse2D.Double(380, 20, 160, 75));
            g2d.setPaint(new Color(75,80,90));
            Rectangle p1=new Rectangle(0,240,400,60);
            g2d.fill(p1);
            g2d.draw(p1);
            g2d.setPaint(Color.white);
            Rectangle p2=new Rectangle(40,270,60,5);
            g2d.fill(p2);
            g2d.draw(p2);
            Rectangle p3=new Rectangle(160,270,60,5);
            g2d.fill(p3);
            g2d.draw(p3);
            Rectangle p4=new Rectangle(280,270,60,5);

            g2d.fill(p4);
            g2d.draw(p4);
            g2d.setPaint(new Color(81, 64, 0));

            g2d.fillRect(220,180,10,40);
            g2d.setPaint(new Color(0, 110, 0));
            g2d.drawOval(195,130,60,60);
            g2d.setPaint(new Color(0, 160, 0));
            g2d.fill(new Ellipse2D.Double(195,130,60,60));

            g2d.setPaint(new Color(81, 64, 0));
            g2d.fillRect(280,180,10,40);
            g2d.setPaint(new Color(0, 110, 0));
            g2d.drawOval(255,130,60,60);
            g2d.setPaint(new Color(0, 160, 0));
            g2d.fill(new Ellipse2D.Double(255,130,60,60));

            g2d.setPaint(new Color(81, 64, 0));
            g2d.fillRect(380,180,10,40);
            g2d.setPaint(new Color(0, 110, 0));
            g2d.drawOval(355,130,60,60);
            g2d.setPaint(new Color(0, 160, 0));
            g2d.fill(new Ellipse2D.Double(355,130,60,60));

            g2d.setPaint(new Color(81, 64, 0));
            g2d.fillRect(580,180,10,40);
            g2d.setPaint(new Color(0, 110, 0));
            g2d.drawOval(555,130,60,60);
            g2d.setPaint(new Color(0, 160, 0));
            g2d.fill(new Ellipse2D.Double(555,130,60,60));

            g2d.setPaint(new Color(81, 64, 0));
            g2d.fillRect(500,290,10,40);
            g2d.setPaint(new Color(0, 110, 0));
            g2d.drawOval(475,240,60,60);
            g2d.setPaint(new Color(0, 160, 0));
            g2d.fill(new Ellipse2D.Double(475,240,60,60));

            g2d.setPaint(new Color(81, 64, 0));
            g2d.fillRect(500,200,10,40);
            g2d.setPaint(new Color(0, 110, 0));
            g2d.drawOval(475,160,60,60);
            g2d.setPaint(new Color(0, 160, 0));
            g2d.fill(new Ellipse2D.Double(475,160,60,60));

            g2d.setPaint(new Color(190, 60, 0));

            Path2D.Double dach;
            dach = new Path2D.Double();
            dach.moveTo(80,240);
            dach.lineTo(95,220);
            dach.lineTo(130,220);
            dach.lineTo(140,240);
            dach.closePath();
            g2d.fill(dach);

            g2d.fillRect(80,231,70,20);

            g2d.setPaint(new Color(111, 178, 255));
            Path2D.Double szyby;
            szyby = new Path2D.Double();
            szyby.moveTo(93,230);
            szyby.lineTo(98,223);
            szyby.lineTo(128,223);
            szyby.lineTo(133,230);
            szyby.closePath();
            g2d.fill(szyby);

            g2d.setPaint(Color.BLACK);
            g2d.fill(new Ellipse2D.Double(88,241,15,15));
            g2d.fill(new Ellipse2D.Double(126,241,15,15));
        }

        @Override
        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            doDrawing(g);
        }
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Rysunek ex = new Rysunek();
                ex.setVisible(true);
            }
        });
    }
}