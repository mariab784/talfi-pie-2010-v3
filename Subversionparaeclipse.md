# Subversionparaeclipse

SubversionEclipse?? Tutorial de instalacion de Subversion en Eclipse Introduction Tutorial de instalacion de Subversion en Eclipse. Adaptado del que usamos en el proyecto de IS asi que si hay alguna errata decidmelo.

Details Instalar parche oficial de Subversion

1. Abre Eclipse.

2. Help -> Software updates

3. Pulsa en la pestaña de arriva que pone "Available software".

4. Pulsa el botón "Add site" y escribe lo siguiente: Pona la siguiente url URL: http://subclipse.tigris.org/update_1.2.x 5. Pulsa OK en esta ventana.

6. Cuando termine de buscar, en la ventana que sale, despliega Subclipse 1.2.x y activa Subclipse Plugin. No actives los Integrations. Next.

7. Acepta los términos de licencia y pulsa Next.

8. Pulsa Finish.

9. Cuando termine de descargar (6,8 MBs), pulsa Install All.

10. Acepta que el Eclipse se reinicie.

Preparar Eclipse para utilizar el repositorio

1. Window -> Open -> Perspective -> Other. Seleccionar SVN Repository Exploring.

2. Pincha con el botón secundario del ratón en el area de la izquierda (donde suele estar el árbol de clases y demás) y elige New -> Repository location

URL: https://si09.googlecode.com/svn/trunk/ (OJO al https). Finish.

Si sale un error en el certificado, ni caso. Accept Permanently.

Si sale un error validando una dirección de tigris, ni caso. Yes.

Empezando a usar el repositorio

1. Vuelve a la perspectiva de Java: Window -> Open Perspective -> Other -> Java (default)

2. En el recuadro de la izquierda, que ahora no tiene nada, botón secundario -> Import -> Other -> Checkout projects from SVN.

3. Marcar (si no está ya) Use existing repository location, y elegir el nuestro de la lista (probablemente el único que haya). Next.

El nombre de usuario y la clave las puedes encontrar en la página del proyecto, en el apartado Source http://code.google.com/p/si09/source. En el primer cuadro azul tienes el nombre de usuario y un link que genera tu clave. Activa Save password para que no te dé la lata.

4. Elegir la primera carpeta, Proyecto\_SI. Finish. Descargará el proyecto a nuestro disco duro. Todo el trabajo que hagas ahora lo harás sobre los archivos de tu disco duro. Más adelante tendrás que actualizar el repositorio para aplicar los cambios que hayas hecho (eso lo vemos luego).