package com.example.myappiiii.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myappiiii.Model.Category
import com.example.myappiiii.databinding.ListItemCategoryBinding

class AdapterCategory(
    // Liste der Kategorien
    private val categories: List<Category>,
    // Funktion, die beim Klicken auf eine Kategorie aufgerufen wird
    //private val onCategoryClick: (List<SubCategory>) -> Unit,
    ) : RecyclerView.Adapter<AdapterCategory.CategoryViewHolder>() {

        // Interner ViewHolder zum Halten der Item-Views
        inner class CategoryViewHolder(val binding: ListItemCategoryBinding) :
            RecyclerView.ViewHolder(binding.root)

        // Methode zum Erstellen eines neuen ViewHolders
        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): CategoryViewHolder {
            // Erstellen des Bindings aus der XML-Datei
            val binding = ListItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return CategoryViewHolder(binding)
        }

        // Methode zum Abrufen der Anzahl der Items
        override fun getItemCount(): Int {
            return categories.size
        }

        // Methode zum Binden der Daten an die Views
        override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
            // Aktuelles Item aus der Kategorienliste holen
            val item = categories[position]
            // Kategorie-Name festlegen
            holder.binding.categoryNameTV.text = item.name
            // Kategorie-Bild festlegen
            holder.binding.categoryIV.setImageResource(item.image)

            // Klick-Listener für jedes Item definieren
            holder.binding.root.setOnClickListener {
                // Aufrufen der onCategoryClick-Funktion mit der Liste der Unterkategorien der Kategorie
                //onCategoryClick(item.subCategory)
            }
        }
}