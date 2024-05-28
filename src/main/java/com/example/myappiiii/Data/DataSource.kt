package com.example.myappiiii.Data

import com.example.myappiiii.Model.Category
import com.example.myappiiii.Model.Subcategory
import com.example.myappiiii.R

class DataSource {


    fun categories(): List<Category> {

        return listOf(

            Category("Gitarre", R.drawable.gitarr, listOf(
                Subcategory("Taylor   Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 1130.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 100.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 130.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 150.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 170.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 160.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 160.99, R.drawable.git),
                Subcategory("Yamaha", "Yamaha 214ce-N Black Dlx Nylon SE", 999.99, R.drawable.git))),

            Category("Piano", R.drawable.pianooo, listOf(
                Subcategory("Roland Piano", "Roland Black SE", 1120.99, R.drawable.pianooo),
                Subcategory("Roland Piano", "Roland 214ce-N Black Dlx Nylon SE", 1210.99, R.drawable.pianooo),
                Subcategory("Roland Piano", "Roland  Black Dlx Nylon SE", 2110.99, R.drawable.pianooo),
                Subcategory("Roland Piano", "Roland 21 Black Dlx Nylon SE", 3110.99, R.drawable.pianooo),
                Subcategory("Roland Piano", "Roland 214cBlack Dlx Nylon SE", 5110.99, R.drawable.pianooo),
                Subcategory("Roland Piano", "Roland 21N Black Dlx Nylon SE", 5110.99, R.drawable.pianooo),
                Subcategory("Roland Piano", "Roland e-N Black Dlx Nylon SE", 6110.99, R.drawable.pianooo),
                Subcategory("Yamaha Piano", "Yamaha Piano D", 9988.99, R.drawable.pianooo))),


            Category("Drum", R.drawable.drum, listOf(
                Subcategory("E-Drum ", "Millenium MPS-1000 E-Drum Set", 110.99, R.drawable.drum),
                Subcategory("E-Drum ", "Millenium MPS-1000 E-Drum Set", 110.99, R.drawable.drum),
                Subcategory("E-Drum ", "Millenium MPS-1000 E-Drum Set", 110.99, R.drawable.drum),
                Subcategory("E-Drum ", "Millenium MPS-1000 E-Drum Set", 110.99, R.drawable.drum),
                Subcategory("E-Drum ", "Millenium MPS-1000 E-Drum Set", 110.99, R.drawable.drum),
                Subcategory("E-Drum ", "Millenium MPS-1000 E-Drum Set", 110.99, R.drawable.drum),
                Subcategory("E-Drum ", "Millenium MPS-1000 E-Drum Set", 110.99, R.drawable.drum),
                Subcategory("E-Drum ", "Millenium MPS-1000 E-Drum Set", 9.99, R.drawable.drum))),

            Category("DJ", R.drawable.dj, listOf(
                Subcategory("Denon DJ", "Mobile 2-Deck Smart DJ-Konsole", 110.99, R.drawable.dj),
                Subcategory("DJ Dnon", "Mobile 2-Deck Smart DJ-Konsole", 110.99, R.drawable.dj),
                Subcategory("Denon DJ", "Mobile 2-Deck Smart DJ-Konsole", 110.99, R.drawable.dj),
                Subcategory("Denon DJ", "Mobile 2-Deck Smart DJ-Konsole", 110.99, R.drawable.dj),
                Subcategory("Denon DJ", "Mobile 2-Deck Smart DJ-Konsole", 110.99, R.drawable.dj),
                Subcategory("Denon DJ", "Mobile 2-Deck Smart DJ-Konsole", 110.99, R.drawable.dj),
                Subcategory("Denon DJ", "Mobile 2-Deck Smart DJ-Konsole", 110.99, R.drawable.dj),
                Subcategory("Denon DJ", "Mobile 2-Deck Smart DJ-Konsole", 9.99, R.drawable.dj))),

            Category("Handpan", R.drawable.handpan, listOf(
                Subcategory("Startone Handpan", "Startone Handpan - Stimmung: D-Kurd ", 110.99, R.drawable.handpan),
                Subcategory("Startone Handpan", "Startone Handpan - Stimmung: D-Kurd", 110.99, R.drawable.handpan),
                Subcategory("Startone Handpan", "Startone Handpan - Stimmung: D-Kurd", 110.99, R.drawable.handpan),
                Subcategory("Startone Handpan", "Startone Handpan - Stimmung: D-Kurd", 110.99, R.drawable.handpan),
                Subcategory("Startone Handpan", "Startone Handpan - Stimmung: D-Kurd", 110.99, R.drawable.handpan),
                Subcategory("Startone Handpan", "Startone Handpan - Stimmung: D-Kurd", 110.99, R.drawable.handpan),
                Subcategory("TStartone Handpan", "Startone Handpan - Stimmung: D-Kurd", 110.99, R.drawable.handpan),
                Subcategory("Startone Handpan", "Startone Handpan - Stimmung: D-Kurd", 9.99, R.drawable.handpan))),

            Category("Violine", R.drawable.geige, listOf(
                Subcategory("TStentor Violine", "Stentor SR1500 Violine Student II 4/4", 210.99, R.drawable.geige),
                Subcategory("Stentor Violine", "Stentor SR1500 Violine Student II 4/4", 310.99, R.drawable.geige),
                Subcategory("Stentor Violine", "Stentor SR1500 Violine Student II 4/4", 110.99, R.drawable.geige),
                Subcategory("Stentor Violine", "Stentor SR1500 Violine Student II 4/4", 330.99, R.drawable.geige),
                Subcategory("Stentor Violine", "Stentor SR1500 Violine Student II 4/4", 100.99, R.drawable.geige),
                Subcategory("Stentor Violine", "Stentor SR1500 Violine Student II 4/4", 1130.99, R.drawable.geige),
                Subcategory("Stentor Violine", "Stentor SR1500 Violine Student II 4/4", 155.99, R.drawable.geige),
                Subcategory("Stentor Violine", "Stentor SR1500 Violine Student II 4/4", 955.99, R.drawable.geige))),
        )




    }
}