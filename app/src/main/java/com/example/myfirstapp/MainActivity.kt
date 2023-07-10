package com.example.myfirstapp
/*package qui contient notre code  */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    /*"conteneur du code, et permet de l'exécuter. :AppCompatActivity => hérite */
    override fun onCreate(savedInstanceState: Bundle?) {
        /*méthode de création onCreate appelée quand le main sera créé. une activity = un écran, plusieurs écrans plusieurs activités*/
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*relie le fichier activity_main interface. res/layout. Vue de contenu. r.layout(=mise en page) => chemin. = définissez la vue pour notre activité principale*/
    }
}