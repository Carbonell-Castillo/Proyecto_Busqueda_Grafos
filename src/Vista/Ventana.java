package Vista;

import Style.Circulo;
import Style.Lineas;
import Logica.CirculoLogica;
import Logica.LineasLogica;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class Ventana extends javax.swing.JFrame {

    private static int mode = 0;
    private static char identificador = 'a', v1 = ' ', v2 = ' ';
    private static int LineasI = 0;
    private static int xmouse = 0, ymouse = 0;
    private static int click = 0;
    private static int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
    private static boolean MAdyacencia[][] = new boolean[CirculoLogica.getCirculos().size()][CirculoLogica.getCirculos().size()];
    private static List<String> listaString = new ArrayList<>();
    private static List<String> listaOrdenado = new ArrayList<>();

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        cbV1.setSelectedIndex(-1);
        cbV2.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        grafo1 = new Vista.Grafo();
        cmdArista = new javaswing.controls.ButtonCustom();
        cmdVertice = new javaswing.controls.ButtonCustom();
        cmdLimpiar = new javaswing.controls.ButtonCustom();
        cbV1 = new javaswing.controls.Combobox();
        cbV2 = new javaswing.controls.Combobox();
        cmdBuscar = new javaswing.controls.ButtonCustom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmdTodosCaminos = new javaswing.controls.ButtonCustom();
        lblOpcionSeleccionada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCaminos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        grafo1.setBackground(new java.awt.Color(255, 255, 255));
        grafo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        grafo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                grafo1MouseMoved(evt);
            }
        });
        grafo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grafo1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout grafo1Layout = new javax.swing.GroupLayout(grafo1);
        grafo1.setLayout(grafo1Layout);
        grafo1Layout.setHorizontalGroup(
            grafo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        grafo1Layout.setVerticalGroup(
            grafo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        cmdArista.setText("Arista");
        cmdArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAristaActionPerformed(evt);
            }
        });

        cmdVertice.setText("Vertice");
        cmdVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVerticeActionPerformed(evt);
            }
        });

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.setStyle(javaswing.controls.ButtonCustom.ButtonStyle.DESTRUCTIVE);
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        cbV1.setLabeText("Vertice Inicial");

        cbV2.setLabeText("Vertice Final");

        cmdBuscar.setText("Buscar Camino");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("x");

        jLabel2.setText("0");

        jLabel3.setText("y");

        jLabel4.setText("0");

        cmdTodosCaminos.setText("Mostar todos los caminos");
        cmdTodosCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTodosCaminosActionPerformed(evt);
            }
        });

        lblOpcionSeleccionada.setText("Opcion Sleccionada: ");

        listCaminos.setBackground(new java.awt.Color(255, 255, 255));
        listCaminos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listCaminosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listCaminos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOpcionSeleccionada)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(cmdVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdTodosCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(grafo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cbV1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbV2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdTodosCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOpcionSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(grafo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grafo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grafo1MouseClicked
        // TODO add your handling code here:        
        switch (mode) {
            case 0 ->
                System.out.println("NADA");
            case 1 -> {
                try {
                    identificador = 'a';
                    for (Circulo object : CirculoLogica.getCirculos()) {
                        if (object.getIdentificador() == identificador && (identificador >= 'a' && identificador <= 'z')) {
                            identificador++;
                        }
                    }
                } catch (Exception e) {
                }
                Circulo circulo = new Circulo(identificador, xmouse, ymouse);
                identificador++;
                CirculoLogica.addCircle(circulo);
                grafo1.repaint();
                llenarCb();
            }
            case 2 -> {
                if (CirculoLogica.getCirculos().size() < 2) {
                    JOptionPane.showMessageDialog(this, "Ingrese al menos dos vertices");
                } else {
                    for (Circulo circulo1 : CirculoLogica.getCirculos()) {
                        if (xmouse > circulo1.getX() - 20 && ymouse > circulo1.getY() - 20 && xmouse < circulo1.getX() + 20 && ymouse < circulo1.getY() + 20) {
                            if (click == 0) {
                                v1 = circulo1.getIdentificador();
                                x1 = circulo1.getX();
                                y1 = circulo1.getY();
//                                rb1.setSelected(true);
                                click++;
                                break;
                            }
                            if (click == 1) {
                                v2 = circulo1.getIdentificador();
                                x2 = circulo1.getX();
                                y2 = circulo1.getY();
                                click++;
                                break;
                            }
                        }
                    }
                    if (click == 2) {
                        LineasI = 0;
                        for (Lineas object : LineasLogica.getCirculos()) {
                            if (LineasI == object.getIdentificador()) {
                                LineasI++;
                            }
                        }
                        Lineas linea = new Lineas(LineasI, v1, v2, x1, y1, x2, y2);
                        LineasLogica.addLine(linea);
                        buttonGroup1.clearSelection();
                        click = 0;
                    }
                }
                grafo1.repaint();
            }
            default ->
                throw new AssertionError();
        }
    }//GEN-LAST:event_grafo1MouseClicked

    private void grafo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grafo1MouseMoved
        // TODO add your handling code here:
        try {
            Point punto = grafo1.getMousePosition();
            xmouse = (int) punto.getX();
            ymouse = (int) punto.getY();
            jLabel2.setText("" + xmouse);
            jLabel4.setText("" + ymouse);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_grafo1MouseMoved

    private void inicializar() {
        MAdyacencia = new boolean[CirculoLogica.getCirculos().size()][CirculoLogica.getCirculos().size()];
        for (int i = 0; i < CirculoLogica.getCirculos().size(); i++) {
            for (int j = 0; j < CirculoLogica.getCirculos().size(); j++) {
                for (int k = 0; k < LineasLogica.getCirculos().size(); k++) {
                    if ((CirculoLogica.getCirculos().get(i).getIdentificador() == LineasLogica.getCirculos().get(k).getV1()
                            && CirculoLogica.getCirculos().get(j).getIdentificador() == LineasLogica.getCirculos().get(k).getV2())
                            || (CirculoLogica.getCirculos().get(i).getIdentificador() == LineasLogica.getCirculos().get(k).getV2()
                            && CirculoLogica.getCirculos().get(j).getIdentificador() == LineasLogica.getCirculos().get(k).getV1())) {
                        MAdyacencia[i][j] = true;
                    }
                }
            }
        }

        for (int i = 0; i < CirculoLogica.getCirculos().size(); i++) {
            for (int j = 0; j < CirculoLogica.getCirculos().size(); j++) {
                System.out.print(MAdyacencia[i][j] + "     ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        // TODO add your handling code here:
        listaString.clear();
        for (Lineas bs : LineasLogica.getCirculos()) {
            bs.setColor(Color.BLACK);
        }
        if (cbV1.getSelectedIndex() >= 0 && cbV2.getSelectedIndex() >= 0) {
            inicializar();
            printShortestPaths(MAdyacencia, cbV1.getSelectedIndex(), cbV2.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Vertices Validos");
        }
        mostrarCaminos();
        caminoOptimo(0);
        listaOrdenado.clear();
        grafo1.repaint();
    }//GEN-LAST:event_cmdBuscarActionPerformed
    public void mostrarCaminos() {
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("----Listado de caminos-----");
        for (String palabra : listaString) {
            List<String> caracteres = new ArrayList<>();
            for (int i = 0; i < palabra.length(); i++) {
                caracteres.add(String.valueOf(palabra.charAt(i)));
            }
            String camino = String.join("->", caracteres);
            modeloLista.addElement(camino);
        }
        listCaminos.setModel(modeloLista);
    }

    private void cmdAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAristaActionPerformed
        // TODO add your handling code here:
        mode = 2;
        lblOpcionSeleccionada.setText("Opcion Sleccionada: " + "Arista");
    }//GEN-LAST:event_cmdAristaActionPerformed

    private void cmdVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVerticeActionPerformed
        // TODO add your handling code here:
        mode = 1;
        lblOpcionSeleccionada.setText("Opcion Sleccionada: " + "Vertice");
    }//GEN-LAST:event_cmdVerticeActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        CirculoLogica.removeAllCircles();
        LineasLogica.removeAllLines();
        cbV1.setSelectedIndex(0);
        cbV2.setSelectedIndex(0);
        int a = cbV1.getItemCount();
        grafo1.repaint();
        try {
            for (int i = 0; i < a; i++) {
                cbV1.removeItemAt(1);
                cbV2.removeItemAt(1);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdTodosCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTodosCaminosActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        List<String> palabras = listaString;
        List<Color> colores = Arrays.asList(Color.GREEN, Color.RED, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.PINK, Color.MAGENTA, Color.CYAN);
        System.out.println("");
        int n = 0;
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length() - 1; i++) {
                char primerCaracter = Character.toLowerCase(palabra.charAt(i));
                char segundoCaracter = Character.toLowerCase(palabra.charAt(i + 1));
                String primerCaracterString = new String(new char[]{primerCaracter});
                primerCaracterString += new String(new char[]{segundoCaracter});
                if (!listaOrdenado.contains(primerCaracterString)) {
                    listaOrdenado.add(primerCaracterString);
                    System.out.println(primerCaracterString);
                    for (Lineas linea : LineasLogica.getCirculos()) {
                        if ((linea.getV1() == primerCaracter && linea.getV2() == segundoCaracter)
                                || (linea.getV1() == segundoCaracter && linea.getV2() == primerCaracter)) {
                            linea.setColor(colores.get(n));
                        }
                    }
                }
            }
            listaOrdenado.clear();
            n++;
        }
        grafo1.repaint();
    }//GEN-LAST:event_cmdTodosCaminosActionPerformed

    private void listCaminosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listCaminosValueChanged
        // TODO add your handling code here:
        listCaminos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                if (!evt.getValueIsAdjusting()) {
                    Integer seleccion = listCaminos.getSelectedIndex();
                    if (seleccion > 0) {
                        limpiarLineas();
                        caminoOptimo(seleccion - 1);
                    }
                }
            }
        });

    }//GEN-LAST:event_listCaminosValueChanged
    public void limpiarLineas() {
        for (Lineas linea : LineasLogica.getCirculos()) {
            linea.setColor(Color.BLACK);
        }
    }

    public void caminoOptimo(int index) {
        List<Color> colores = Arrays.asList(Color.GREEN, Color.RED, Color.BLUE);
        Random rand = new Random();
        int n = rand.nextInt(colores.size()); // Genera un índice aleatorio
        for (int i = 0; i < listaString.size(); i++) {
            String palabra = listaString.get(i);
            if (i == index) { // Verifica si es el primer elemento
                for (int j = 0; j < palabra.length() - 1; j++) {
                    char primerCaracter = Character.toLowerCase(palabra.charAt(j));
                    char segundoCaracter = Character.toLowerCase(palabra.charAt(j + 1));
                    String primerCaracterString = new String(new char[]{primerCaracter});
                    primerCaracterString += new String(new char[]{segundoCaracter});
                    if (!listaOrdenado.contains(primerCaracterString)) {
                        listaOrdenado.add(primerCaracterString);
                        System.out.println(primerCaracterString);
                        for (Lineas linea : LineasLogica.getCirculos()) {
                            if ((linea.getV1() == primerCaracter && linea.getV2() == segundoCaracter)
                                    || (linea.getV1() == segundoCaracter && linea.getV2() == primerCaracter)) {
                                linea.setColor(colores.get(n));
                            }
                        }
                    }
                }
                listaOrdenado.clear();
                n = rand.nextInt(colores.size()); // Genera un nuevo índice aleatorio para el siguiente elemento
            }
        }
        grafo1.repaint();

    }

    public static void printShortestPaths(boolean[][] adjacencyMatrix, int source, int target) {
        List<List<Integer>> shortestPaths = buscarRutasCortas(adjacencyMatrix, source, target);

        for (List<Integer> path : shortestPaths) {
            StringBuilder sb = new StringBuilder();
            for (int i : path) {
                char c = (char) (i + 65); // Convertir número a letra
                sb.append(c);
            }
            listaString.add(sb.toString());
            System.out.println(sb.toString());
        }
    }

    public static List<List<Integer>> buscarRutasCortas(boolean[][] adjacencyMatrix, int source, int target) {
        int n = adjacencyMatrix.length;
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((path1, path2) -> Integer.compare(path1.size(), path2.size()));
        pq.offer(Collections.singletonList(source));

        List<List<Integer>> shortestPaths = new ArrayList<>();
        ;
        while (!pq.isEmpty() && shortestPaths.size() < 16) {
            List<Integer> path = pq.poll();
            int lastNode = path.get(path.size() - 1);

            if (lastNode == target) {
                shortestPaths.add(path);
                continue;
            }
            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (adjacencyMatrix[lastNode][neighbor] && !path.contains(neighbor)) {
                    List<Integer> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    pq.offer(newPath);
                }
            }
        }
        return shortestPaths;
    }

    private void llenarCb() {
        if (!CirculoLogica.getCirculos().isEmpty()) {
            for (Circulo i : CirculoLogica.getCirculos()) {
                boolean repetidos = false;
                for (int j = 0; j < cbV1.getItemCount(); j++) {
                    if (cbV1.getItemAt(j).equals(i.getIdentificador() + "")) {
                        repetidos = true;
                        break;
                    }
                }
                if (repetidos == false) {
                    cbV1.addItem(i.getIdentificador() + "");
                    cbV2.addItem(i.getIdentificador() + "");
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javaswing.controls.Combobox cbV1;
    private javaswing.controls.Combobox cbV2;
    private javaswing.controls.ButtonCustom cmdArista;
    private javaswing.controls.ButtonCustom cmdBuscar;
    private javaswing.controls.ButtonCustom cmdLimpiar;
    private javaswing.controls.ButtonCustom cmdTodosCaminos;
    private javaswing.controls.ButtonCustom cmdVertice;
    private Vista.Grafo grafo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOpcionSeleccionada;
    private javax.swing.JList<String> listCaminos;
    // End of variables declaration//GEN-END:variables
}