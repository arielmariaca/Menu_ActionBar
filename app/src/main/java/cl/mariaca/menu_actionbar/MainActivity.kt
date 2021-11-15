package cl.mariaca.menu_actionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            //menu principal
            R.id.nav_search -> Toast.makeText(this,"Buscar", Toast.LENGTH_SHORT).show()
            R.id.nav_add -> Toast.makeText(this,"Agregar", Toast.LENGTH_SHORT).show()
            R.id.nav_save -> Toast.makeText(this,"Guardar", Toast.LENGTH_SHORT).show()
            R.id.nav_delete -> Toast.makeText(this,"Borrar", Toast.LENGTH_SHORT).show()
            //menu submenu
            R.id.nav_addnew -> Toast.makeText(this,"Agregar Nuevo", Toast.LENGTH_SHORT).show()
            R.id.nav_addold -> Toast.makeText(this,"Agregar Viejo", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}