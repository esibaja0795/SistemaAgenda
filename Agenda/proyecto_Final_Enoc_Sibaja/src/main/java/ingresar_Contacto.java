/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Enoc
 */
public class ingresar_Contacto extends javax.swing.JFrame {

    /**
     * Creates new form ingresar_Contacto
     */
    public ingresar_Contacto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Ingreso1 = new javax.swing.JPanel();
        titulo_Personal1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        telPersonal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telTrabajo = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        guardar_InfoP = new javax.swing.JButton();
        boton_MenuP_Ingreso = new javax.swing.JButton();
        salir_IngresoP = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        text_Buscador = new javax.swing.JTextField();
        buscar_InfoP = new javax.swing.JButton();
        eliminar_InfoP = new javax.swing.JButton();
        modificar_InfoP = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        foto = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo_Personal1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo_Personal1.setText("  INFORMACION DE CONTACTO");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Telefono personal:");

        telPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telPersonalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Telefono Trabajo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Correo electronico:");

        telTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telTrabajoActionPerformed(evt);
            }
        });

        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        guardar_InfoP.setBackground(new java.awt.Color(51, 102, 0));
        guardar_InfoP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        guardar_InfoP.setForeground(new java.awt.Color(255, 255, 204));
        guardar_InfoP.setText("GUARDAR NUEVO");
        guardar_InfoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_InfoPActionPerformed(evt);
            }
        });

        boton_MenuP_Ingreso.setBackground(new java.awt.Color(51, 102, 0));
        boton_MenuP_Ingreso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_MenuP_Ingreso.setForeground(new java.awt.Color(255, 255, 204));
        boton_MenuP_Ingreso.setText("MENU PRINCIPAL");
        boton_MenuP_Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_MenuP_IngresoActionPerformed(evt);
            }
        });

        salir_IngresoP.setBackground(new java.awt.Color(255, 0, 0));
        salir_IngresoP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salir_IngresoP.setForeground(new java.awt.Color(255, 255, 204));
        salir_IngresoP.setText("SALIR");
        salir_IngresoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_IngresoPActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Ingrese nombre que desea buscar / modificar");

        buscar_InfoP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscar_InfoP.setText("BUSCAR");
        buscar_InfoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_InfoPActionPerformed(evt);
            }
        });

        eliminar_InfoP.setBackground(new java.awt.Color(255, 51, 51));
        eliminar_InfoP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminar_InfoP.setForeground(new java.awt.Color(255, 255, 204));
        eliminar_InfoP.setText("ELIMINAR CONTACTO");
        eliminar_InfoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_InfoPActionPerformed(evt);
            }
        });

        modificar_InfoP.setBackground(new java.awt.Color(0, 102, 102));
        modificar_InfoP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modificar_InfoP.setForeground(new java.awt.Color(255, 255, 204));
        modificar_InfoP.setText("MODIFICAR INFORMACION");
        modificar_InfoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_InfoPActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText("*Este campo no puede ser modificado");

        foto.setBackground(new java.awt.Color(0, 102, 102));
        foto.setForeground(new java.awt.Color(255, 255, 204));
        foto.setText("ELEGIR FOTO");
        foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoActionPerformed(evt);
            }
        });

        imagen.setBackground(new java.awt.Color(102, 102, 0));
        imagen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        imagen.setForeground(new java.awt.Color(51, 51, 51));
        imagen.setText("                       SUBIR FOTO");
        imagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout panel_Ingreso1Layout = new javax.swing.GroupLayout(panel_Ingreso1);
        panel_Ingreso1.setLayout(panel_Ingreso1Layout);
        panel_Ingreso1Layout.setHorizontalGroup(
            panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                        .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                                .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel1)
                                        .addGap(71, 71, 71)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                                        .addGap(195, 195, 195)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(jLabel5))
                                    .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_Ingreso1Layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(telTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(telPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                                .addComponent(titulo_Personal1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(text_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                                        .addComponent(guardar_InfoP)
                                        .addGap(31, 31, 31)
                                        .addComponent(modificar_InfoP)
                                        .addGap(98, 98, 98)
                                        .addComponent(eliminar_InfoP))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Ingreso1Layout.createSequentialGroup()
                                        .addComponent(foto)
                                        .addGap(8, 8, 8)))
                                .addGap(47, 47, 47)
                                .addComponent(salir_IngresoP)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Ingreso1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(61, 61, 61))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Ingreso1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(boton_MenuP_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar_InfoP)
                .addGap(147, 147, 147))
        );
        panel_Ingreso1Layout.setVerticalGroup(
            panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                        .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(titulo_Personal1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(boton_MenuP_Ingreso))
                    .addComponent(buscar_InfoP, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(35, 35, 35)
                        .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(49, 49, 49)
                        .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(telPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(telTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(panel_Ingreso1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(foto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panel_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar_InfoP)
                    .addComponent(salir_IngresoP)
                    .addComponent(eliminar_InfoP)
                    .addComponent(modificar_InfoP))
                .addGap(20, 20, 20))
        );

        imagen.getAccessibleContext().setAccessibleName("foto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Ingreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Ingreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificar_InfoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_InfoPActionPerformed
        // TODO add your handling code here:
        informacion_Personal modificar_P = new informacion_Personal();
        File fichero_Mod = new File("C:\\proyecto_Final_Enoc_Sibaja\\contactos.txt");
        ArrayList<String> resultado_Consulta = new ArrayList<>();

        if(fichero_Mod.exists()) {

            try{
                String linea_Archivo;

                FileReader lector = new FileReader(fichero_Mod);
                BufferedReader buffer_Lector = new BufferedReader(lector);

                while((linea_Archivo=buffer_Lector.readLine()) != null) {
                    String[] nuevos_Datos = linea_Archivo.split("---");

                    if(!nuevos_Datos[0].equals(text_Buscador.getText())) {
                        resultado_Consulta.add(linea_Archivo);
                    } else{
                        nuevos_Datos[1] = telPersonal.getText();
                        modificar_P.setTelPersonal(nuevos_Datos[1]);

                        nuevos_Datos[2] = telTrabajo.getText();
                        modificar_P.setTelTrabajo(nuevos_Datos[2]);

                        nuevos_Datos[3] = correo.getText();
                        modificar_P.setCorreo(nuevos_Datos[3]);

                        resultado_Consulta.add(nuevos_Datos[0] + "---" + nuevos_Datos[1] + "---" + nuevos_Datos[2] +
                            "---" + nuevos_Datos[3]);
                    }
                }
                JOptionPane.showMessageDialog(null, "La informacion fue modificada");
                
                lector.close();
                buffer_Lector.close();
                File fichero_Temp = new File("C:\\proyecto_Final_Enoc_Sibaja\\contactos.txt");
                fichero_Temp.delete();
                FileWriter fichero_Nuevo = new FileWriter("C:\\proyecto_Final_Enoc_Sibaja\\contactos.txt");
                PrintWriter digitador = new PrintWriter(fichero_Nuevo);

                for (int i = 0; i < resultado_Consulta.size(); i++) {
                    digitador.println(resultado_Consulta.get(i));
                }

                digitador.close();
                fichero_Nuevo.close();

                JTextField caja;

                for (int i = 0; i < panel_Ingreso1.getComponentCount(); i++) {
                    if(panel_Ingreso1.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                        caja = (JTextField)panel_Ingreso1.getComponent(i);
                        caja.setText("");
                    }
                }
            } catch(IOException e) {
                System.out.println("Ocurrio un error en la busqueda!");
            }
        }
        
        imagen.setIcon(null);
    }//GEN-LAST:event_modificar_InfoPActionPerformed

    private void buscar_InfoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_InfoPActionPerformed
        // TODO add your handling code here
        informacion_Personal info_P = new informacion_Personal();
        //File fichero = new File("C:\\proyecto_Final_Enoc_Sibaja\\informacion_Personal.txt");
        FileReader lector_Buscar = null;
        //ArrayList<String> resultado_Consulta = new ArrayList<>();
        
        JOptionPane.showMessageDialog(null, "Para modificar debe editar el campo y posteriormente utilizar el boton "
                + "MODIFICAR INFORMACION");
        
        try{
            File fichero = new File("C:\\proyecto_Final_Enoc_Sibaja\\contactos.txt");
            String linea_Archivo;
            boolean encontrado = false;

            String nombre_Buscar = text_Buscador.getText();

            lector_Buscar = new FileReader(fichero);
            BufferedReader buffer_Lector = new BufferedReader(lector_Buscar);

            while((linea_Archivo=buffer_Lector.readLine()) != null) {
                String[] datos_Busqueda = linea_Archivo.split("---");

                if(datos_Busqueda[0].equals(nombre_Buscar)) {
                    encontrado = true;

                    nombre.setText(datos_Busqueda[0]);
                    telPersonal.setText(datos_Busqueda[1]);
                    telTrabajo.setText(datos_Busqueda[2]);
                    correo.setText(datos_Busqueda[3]);
                }
            }

            if(encontrado == false){
                JOptionPane.showMessageDialog(null, "Informacion no encontrada");
            }

        }catch(IOException e) {
            System.out.println("Ocurrio un error en la busqueda!");
        } finally {

            try{
                if(null == lector_Buscar) {
                    lector_Buscar.close();
                }
            } catch(IOException e2) {
                e2.printStackTrace();
            }
        }
    }//GEN-LAST:event_buscar_InfoPActionPerformed

    private void salir_IngresoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_IngresoPActionPerformed
        // TODO add your handling code here:
        login login_Personal = new login();
        login_Personal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salir_IngresoPActionPerformed

    private void boton_MenuP_IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_MenuP_IngresoActionPerformed
        // TODO add your handling code here:
        menu menu_Personal_Ingreso = new menu();
        menu_Personal_Ingreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_MenuP_IngresoActionPerformed

    private void guardar_InfoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_InfoPActionPerformed
        // TODO add your handling code here:
        informacion_Personal info_P = new informacion_Personal();
        
        String nombre_Ingresado = nombre.getText();
        info_P.setNombre(nombre_Ingresado);
        //JOptionPane.showMessageDialog(null,"Nombre: " + info_P.getNombre());

        String organizacion_Ingresado = telPersonal.getText();
        info_P.setTelPersonal(organizacion_Ingresado);

        String puesto_Ingresado = telTrabajo.getText();
        info_P.setTelTrabajo(puesto_Ingresado);

        String archivar_Ingresado = correo.getText();
        info_P.setCorreo(archivar_Ingresado);

        try{
            FileWriter fichero_Insertar = new FileWriter("C:\\proyecto_Final_Enoc_Sibaja\\contactos.txt", true);

            fichero_Insertar.write(info_P.getNombre() + "---" + info_P.getTelPersonal() + "---" +
                info_P.getTelTrabajo() + "---" + info_P.getCorreo() + "\r\n");

            fichero_Insertar.close();
            
            JOptionPane.showMessageDialog(null, "Informacion ingresada con exito.");

        } catch(IOException e) {
            System.out.println("Ocurrio un error al guardar la informacion!");
        }

        JTextField caja;

        for (int i = 0; i < panel_Ingreso1.getComponentCount(); i++) {
            if(panel_Ingreso1.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                caja = (JTextField)panel_Ingreso1.getComponent(i);
                caja.setText("");
            }
        }
        
        imagen.setIcon(null);
    }//GEN-LAST:event_guardar_InfoPActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void telTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telTrabajoActionPerformed

    private void telPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telPersonalActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_nombreActionPerformed

    private void eliminar_InfoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_InfoPActionPerformed
        // TODO add your handling code here:
        informacion_Personal modificar_P = new informacion_Personal();
        File fichero_Mod = new File("C:\\proyecto_Final_Enoc_Sibaja\\contactos.txt");
        ArrayList<String> resultado_Consulta = new ArrayList<>();
        
        if(fichero_Mod.exists()) {

            try{
                String linea_Archivo;

                FileReader lector = new FileReader(fichero_Mod);
                BufferedReader buffer_Lector = new BufferedReader(lector);

                while((linea_Archivo=buffer_Lector.readLine()) != null) {
                    String[] nuevos_Datos = linea_Archivo.split("---");

                    if(!nuevos_Datos[0].equals(text_Buscador.getText())) {
                        resultado_Consulta.add(linea_Archivo);
                    } else{
                        nuevos_Datos[0] = "";
                        modificar_P.setNombre(nuevos_Datos[0]);
                        
                        nuevos_Datos[1] = "";
                        modificar_P.setTelPersonal(nuevos_Datos[1]);

                        nuevos_Datos[2] = "";
                        modificar_P.setTelTrabajo(nuevos_Datos[2]);

                        nuevos_Datos[3] = "";
                        modificar_P.setCorreo(nuevos_Datos[3]);

                        resultado_Consulta.add(nuevos_Datos[0] + "" + nuevos_Datos[1] + "" + nuevos_Datos[2] +
                            "" + nuevos_Datos[3]);
                    }
                }
                
                JOptionPane.showMessageDialog(null, "La informacion fue eliminada");
                
                lector.close();
                buffer_Lector.close();
                File fichero_Temp = new File("C:\\proyecto_Final_Enoc_Sibaja\\contactos.txt");
                fichero_Temp.delete();
                FileWriter fichero_Nuevo = new FileWriter("C:\\proyecto_Final_Enoc_Sibaja\\contactos.txt");
                PrintWriter digitador = new PrintWriter(fichero_Nuevo);

                for (int i = 0; i < resultado_Consulta.size(); i++) {
                    digitador.println(resultado_Consulta.get(i));
                }

                digitador.close();
                fichero_Nuevo.close();

                JTextField caja;

                for (int i = 0; i < panel_Ingreso1.getComponentCount(); i++) {
                    if(panel_Ingreso1.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                        caja = (JTextField)panel_Ingreso1.getComponent(i);
                        caja.setText("");
                    }
                }
            } catch(IOException e) {
                System.out.println("Ocurrio un error en la busqueda!");
            }
        }
    }//GEN-LAST:event_eliminar_InfoPActionPerformed

    File archivo;
    
    private void fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoActionPerformed
        // TODO add your handling code here:
        int resultado;
        
        buscarImg buscador = new buscarImg();
        
        FileNameExtensionFilter formato = new FileNameExtensionFilter("JPG, PNG y GIF", "jpg", "png", "gif");
        
        buscador.panelImg.setFileFilter(formato);
        
        resultado = buscador.panelImg.showOpenDialog(null);
        
        if(JFileChooser.APPROVE_OPTION == resultado) {
            archivo = buscador.panelImg.getSelectedFile();
            
            
            try{
                ImageIcon ImgIcon = new ImageIcon(archivo.toString());
                
                Icon icono = new ImageIcon(ImgIcon.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), 
                        Image.SCALE_DEFAULT));
                
                imagen.setIcon(icono);
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar la imagen");
            }
                
        }
    }//GEN-LAST:event_fotoActionPerformed

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
            java.util.logging.Logger.getLogger(ingresar_Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresar_Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresar_Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresar_Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresar_Contacto().setVisible(true);
            }
        });
    }
    
    public class informacion_Personal {
        
        private String nombre;
        private String telPersonal;
        private String telTrabajo;
        private String correo;
          
        public informacion_Personal() {
            
        }
        
        public informacion_Personal(String nombre, String telPersonal, String telTrabajo, String correo) {
            
            this.nombre = nombre;
            this.telPersonal = telPersonal;
            this.telTrabajo = telTrabajo;
            this.correo = correo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelPersonal() {
            return telPersonal;
        }

        public void setTelPersonal(String telPersonal) {
            this.telPersonal = telPersonal;
        }

        public String getTelTrabajo() {
            return telTrabajo;
        }

        public void setTelTrabajo(String telTrabajo) {
            this.telTrabajo = telTrabajo;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }
        
        public void ingresar_informacion(){
            
        }

        private boolean getComponentCount() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_MenuP_Ingreso;
    private javax.swing.JButton buscar_InfoP;
    private javax.swing.JTextField correo;
    private javax.swing.JButton eliminar_InfoP;
    private javax.swing.JButton foto;
    private javax.swing.JButton guardar_InfoP;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton modificar_InfoP;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panel_Ingreso1;
    private javax.swing.JButton salir_IngresoP;
    private javax.swing.JTextField telPersonal;
    private javax.swing.JTextField telTrabajo;
    private javax.swing.JTextField text_Buscador;
    private javax.swing.JLabel titulo_Personal1;
    // End of variables declaration//GEN-END:variables
}
