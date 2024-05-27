package com.example.myappiiii.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myappiiii.Model.Category
import com.example.myappiiii.Model.Subcategory
import com.example.myappiiii.databinding.ListItemSubBinding

class SubcategoryAdapter(
    // Liste der Unterkategorien
    private var subcategories: List<Subcategory>,
    // Funktion, die beim Klicken auf eine Unterkategorie aufgerufen wird
    private val onSubcategoryClick: (Subcategory) -> Unit
) : RecyclerView.Adapter<SubcategoryAdapter.SubcategoryViewHolder>() {

    // Interner ViewHolder zum Halten der Item-Views
    inner class SubcategoryViewHolder(val binding: ListItemSubBinding) :
        RecyclerView.ViewHolder(binding.root)

    // Methode zum Erstellen eines neuen ViewHolders
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubcategoryViewHolder {
        // Erstellen des Bindings aus der XML-Datei
        val binding = ListItemSubBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SubcategoryViewHolder(binding)
    }

    // Methode zum Abrufen der Anzahl der Items
    override fun getItemCount(): Int {
        return subcategories.size
    }

    // Methode zum Binden der Daten an die Views
    override fun onBindViewHolder(holder: SubcategoryViewHolder, position: Int) {
        // Aktuelles Item aus der Unterkategorienliste holen
        val item = subcategories[position]
        // Unterkategorien-Name festlegen
        holder.binding.NameSubcatTV.text = item.name
        // Unterkategorien-Beschreibung festlegen
        holder.binding.descriptionTV.text = item.description
        // Unterkategorien-Preis festlegen
        holder.binding.subCategoryPriceTV.text = String.format("%.2f €", item.price)
        // Unterkategorien-Bild festlegen
        holder.binding.subcategoryIV.setImageResource(item.image)
        // Klick-Listener für jedes Item definieren
        holder.binding.root.setOnClickListener {
//            // Aufrufen der onSubcategoryClick-Funktion mit der aktuellen Unterkategorie
            onSubcategoryClick(item)
        }
    }
}
