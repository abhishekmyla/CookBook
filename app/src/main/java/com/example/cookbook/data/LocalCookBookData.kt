package com.example.cookbook.data

import com.example.cookbook.model.CookBook
import com.example.cookbook.R

object LocalCookBookData {
    val defaultRecipe = getRecipesData()[0]

    fun getRecipesData(): List<CookBook> {
        return listOf(
            CookBook(
                id = 1,
                titleResourceId = R.string.classic_stuffed_peppers,
                imageResourceId = R.drawable.classic_stuffed_peppers,
                imageBanner = R.drawable.classic_stuffed_peppers_banner,
                ingredients = "4 large bell peppers, 1 pound ground beef, 1 cup cooked rice, 1 can (15 ounces) black beans (drained and rinsed), 1 cup corn kernels, 1 cup diced tomatoes, 1 cup shredded cheddar cheese, 1 teaspoon chili powder, 1/2 teaspoon cumin, Salt and pepper to taste",
                recipeDetails = """
        1. Preheat oven to 375°F (190°C).
        2. Cut the tops off the bell peppers and remove seeds.
        3. In a bowl, mix ground beef, cooked rice, black beans, corn, tomatoes, 1/2 cup cheddar cheese, chili powder, cumin, salt, and pepper.
        4. Stuff each bell pepper with the mixture.
        5. Top each pepper with remaining cheddar cheese.
        6. Place peppers in a baking dish and bake for 25-30 minutes.
        7. Serve hot and enjoy!
    """
            ),
            CookBook(
                id = 2,
                titleResourceId = R.string.creamy_tuscan_salmon,
                imageResourceId = R.drawable.creamy_tuscan_salmon,
                imageBanner = R.drawable.creamy_tuscan_salmon_banner,
                ingredients = "4 salmon fillets, Salt and black pepper to taste, 2 tablespoons olive oil, 4 cloves garlic (minced), 1 cup cherry tomatoes (halved), 1/2 cup sun-dried tomatoes (chopped), 1 cup baby spinach, 1 cup heavy cream, 1/2 cup chicken broth, 1 teaspoon dried oregano, 1 teaspoon dried thyme, 1/2 cup grated Parmesan cheese, Fresh parsley for garnish (optional)",
                recipeDetails = """
        1. Season the salmon fillets with salt and black pepper.
        2. In a large skillet, heat olive oil over medium-high heat.
        3. Add salmon fillets to the skillet and cook for 4-5 minutes per side, or until cooked through. Remove from the skillet and set aside.
        4. In the same skillet, add minced garlic and sauté until fragrant.
        5. Add cherry tomatoes, sun-dried tomatoes, and baby spinach to the skillet. Cook until the spinach wilts and tomatoes soften.
        6. Pour in heavy cream and chicken broth. Stir in dried oregano and dried thyme. Bring the mixture to a simmer.
        7. Add grated Parmesan cheese to the skillet and stir until the sauce thickens.
        8. Return the cooked salmon fillets to the skillet, spooning the creamy Tuscan sauce over them. Simmer for an additional 2-3 minutes to heat through.
        9. Garnish with fresh parsley if desired.
        10. Serve the creamy Tuscan salmon over pasta, rice, or with your favorite side dish.
    """
            ),
            CookBook(
                id = 3,
                titleResourceId = R.string.frittata_affogato,
                imageResourceId = R.drawable.frittata_affogato,
                imageBanner = R.drawable.frittata_affogato_banner,
                ingredients = "6 large eggs, 1/4 cup milk, Salt and black pepper to taste, 1 tablespoon olive oil, 1/2 cup diced onion, 1/2 cup diced bell peppers (any color), 1/2 cup diced tomatoes, 1/4 cup grated Parmesan cheese, 1/4 cup chopped fresh basil, 1/4 cup chopped fresh parsley, 1 cup shredded mozzarella cheese, 2 cups arugula (for serving), Balsamic glaze for drizzling",
                recipeDetails = """
        1. Preheat the oven broiler.
        2. In a bowl, whisk together eggs, milk, salt, and black pepper.
        3. In an oven-safe skillet, heat olive oil over medium heat.
        4. Add diced onion, bell peppers, and tomatoes to the skillet. Cook until vegetables are softened.
        5. Pour the egg mixture over the vegetables in the skillet.
        6. Sprinkle Parmesan cheese, fresh basil, and fresh parsley over the eggs.
        7. Cook on the stovetop for a few minutes until the edges start to set.
        8. Sprinkle shredded mozzarella cheese over the top.
        9. Transfer the skillet to the preheated broiler and cook until the top is golden and the eggs are fully set.
        10. Remove from the"""
            ),
            CookBook(
                id = 4,
                titleResourceId = R.string.grilled_tomatoes,
                imageResourceId = R.drawable.grilled_tomatoes,
                imageBanner = R.drawable.grilled_tomatoes_banner,
                ingredients = "4 large tomatoes, 2 tablespoons olive oil, Salt and pepper to taste",
                recipeDetails = """
        1. Preheat grill to medium-high heat.
        2. Slice tomatoes into 1/2-inch rounds.
        3. Brush both sides with olive oil and season with salt and pepper.
        4. Grill for 3-4 minutes per side, until grill marks appear.
        5. Serve hot and enjoy!
    """
            ),
            CookBook(
                id = 5,
                titleResourceId = R.string.hawaiian_garlic_shrimp,
                imageResourceId = R.drawable.hawaiian_garlic_shrimp,
                imageBanner = R.drawable.hawaiian_garlic_shrimp_banner,
                ingredients = "1 pound large shrimp, 4 cloves garlic (minced), 1/4 cup soy sauce, 1 cup pineapple chunks",
                recipeDetails = """
        1. Heat olive oil in a skillet over medium heat.
        2. Add minced garlic and sauté until fragrant.
        3. Add shrimp and cook until pink.
        4. Pour in soy sauce and stir in pineapple chunks.
        5. Simmer for 5-7 minutes.
        6. Serve over rice or noodles.
    """
            ),
            CookBook(
                id = 6,
                titleResourceId = R.string.key_lime_pie,
                imageResourceId = R.drawable.key_lime_pie_mousse,
                imageBanner = R.drawable.key_lime_pie_mousse_banner,
                ingredients = "1 1/2 cups graham cracker crumbs, 1/2 cup unsalted butter (melted), 3 cups sweetened condensed milk, 1/2 cup sour cream, 3/4 cup key lime juice, Zest of 2 limes",
                recipeDetails = """
        1. Preheat oven to 350°F (175°C).
        2. Mix graham cracker crumbs and melted butter. Press into the bottom of a pie dish.
        3. In a bowl, combine sweetened condensed milk, sour cream, key lime juice, and lime zest.
        4. Pour the mixture over the crust.
        5. Bake for 10 minutes until set but not browned.
        6. Allow to cool, then refrigerate for at least 3 hours.
        7. Garnish with additional lime zest before serving.
    """
            ),
            CookBook(
                id = 7,
                titleResourceId = R.string.pumpkin_cheesecake,
                imageResourceId = R.drawable.pumpkin_cheesecake,
                imageBanner = R.drawable.pumpkin_cheesecake_banner,
                ingredients = "2 cups graham cracker crumbs, 1/2 cup unsalted butter (melted), 4 packages (8 ounces each) cream cheese (softened), 1 1/4 cups granulated sugar, 1 can (15 ounces) pumpkin puree, 4 large eggs, 1/4 cup all-purpose flour, 1 teaspoon vanilla extract, 1 teaspoon ground cinnamon, 1/2 teaspoon ground nutmeg, 1/2 teaspoon ground ginger, 1/4 teaspoon ground cloves",
                recipeDetails = """
        1. Preheat oven to 325°F (163°C).
        2. Mix graham cracker crumbs and melted butter. Press into the bottom of a springform pan.
        3. In a large bowl, beat cream cheese and sugar until smooth.
        4. Add pumpkin puree, eggs, flour, vanilla extract, and spices. Mix until well combined.
        5. Pour the batter over the crust.
        6. Bake for 1 hour or until the center is set.
        7. Allow to cool, then refrigerate for at least 4 hours.
        8. Serve chilled, optionally with whipped cream.
    """
            ),
            CookBook(
                id = 8,
                titleResourceId = R.string.caramel_apple_pie,
                imageResourceId = R.drawable.salted_caramel_apple_pie_1,
                imageBanner = R.drawable.salted_caramel_apple_pie_1_banner,
                ingredients = "6 cups thinly sliced peeled apples, 3/4 cup granulated sugar, 2 tablespoons all-purpose flour, 1 teaspoon ground cinnamon, 1/4 teaspoon salt, 1 package (14.1 ounces) refrigerated pie crusts, 1/4 cup caramel sauce (store-bought or homemade)",
                recipeDetails = """
        1. Preheat oven to 425°F (220°C).
        2. In a large bowl, combine sliced apples, sugar, flour, cinnamon, and salt. Toss until apples are coated.
        3. Line a pie dish with one pie crust. Fill with apple mixture.
        4. Drizzle caramel sauce over the apples.
        5. Top with the second pie crust, seal the edges, and cut slits in the top crust.
        6. Bake for 40-45 minutes or until the crust is golden brown.
        7. Allow to cool before serving.
    """
            ),
            CookBook(
                id = 9,
                titleResourceId = R.string.caramel_chocolate,
                imageResourceId = R.drawable.salted_caramel_chocolate_fudge_cake,
                imageBanner = R.drawable.salted_caramel_chocolate_fudge_cake_banner,
                ingredients = "1 and 3/4 cups all-purpose flour, 1 cup granulated sugar, 3/4 cup unsweetened cocoa powder, 1 and 1/2 teaspoons baking powder, 1 and 1/2 teaspoons baking soda, 1 teaspoon salt, 2 large eggs, 1 cup whole milk, 1/2 cup vegetable oil, 2 teaspoons vanilla extract, 1 cup boiling water, 1 cup salted caramel sauce",
                recipeDetails = """
        1. Preheat oven to 350°F (175°C). Grease and flour two 9-inch round cake pans.
        2. In a large bowl, sift together flour, sugar, cocoa powder, baking powder, baking soda, and salt.
        3. Add eggs, milk, oil, and vanilla extract. Beat on medium speed for 2 minutes.
        4. Stir in boiling water until well combined. The batter will be thin.
        5. Pour the batter evenly into the prepared pans.
        6. Bake for 30 to 35 minutes or until a toothpick inserted into the center comes out clean.
        7. Allow the cakes to cool completely. Drizzle with salted caramel sauce before serving.
    """
            ),
            CookBook(
                id = 10,
                titleResourceId = R.string.skillet_enchilada,
                imageResourceId = R.drawable.skillet_enchilada_meatballs,
                imageBanner = R.drawable.skillet_enchilada_meatballs_banner,
                ingredients = "1 pound ground beef, 1/2 cup breadcrumbs, 1/4 cup chopped onion, 1 teaspoon chili powder, 1/2 teaspoon cumin, 1/2 teaspoon garlic powder, 1/4 teaspoon salt, 1/4 teaspoon black pepper, 1 can (10 ounces) red enchilada sauce, 1 cup shredded cheddar cheese, Chopped fresh cilantro for garnish",
                recipeDetails = """
        1. Preheat oven to 375°F (190°C).
        2. In a bowl, combine ground beef, breadcrumbs, chopped onion, chili powder, cumin, garlic powder, salt, and black pepper.
        3. Form the mixture into meatballs and place them in a skillet.
        4. Pour enchilada sauce over the meatballs and bake for 20-25 minutes.
        5. Sprinkle shredded cheddar cheese on top and bake until cheese is melted and bubbly.
        6. Garnish with chopped cilantro before serving.
    """
            ),
            CookBook(
                id = 11,
                titleResourceId = R.string.vegan_lasagna,
                imageResourceId = R.drawable.vegan_lasagna,
                imageBanner = R.drawable.vegan_lasagna_banner,
                ingredients = "9 lasagna noodles, 1 tablespoon olive oil, 1 large onion (chopped), 3 cloves garlic (minced), 1 bell pepper (chopped), 1 zucchini (sliced), 1 can (14 ounces) crushed tomatoes, 1 can (6 ounces) tomato paste, 1/2 cup water, 1 teaspoon dried oregano, 1 teaspoon dried basil, Salt and pepper to taste, 2 cups spinach leaves, 1 package (14 ounces) firm tofu (drained and crumbled), 1/4 cup nutritional yeast, 1 tablespoon lemon juice, 3 cups vegan mozzarella cheese",
                recipeDetails = """
        1. Preheat oven to 375°F (190°C).
        2. Cook lasagna noodles according to package instructions. Drain and set aside.
        3. In a large skillet, heat olive oil over medium heat. Add chopped onion, minced garlic, bell pepper, and zucchini. Cook until vegetables are softened.
        4. Stir in crushed tomatoes, tomato paste, water, oregano, basil, salt, and pepper. Simmer for 10 minutes.
        5. In a bowl, mix crumbled tofu with nutritional yeast and lemon juice.
        6. In a baking dish, layer lasagna noodles, vegetable-tomato sauce, spinach, and tofu mixture. Repeat until ingredients are used, finishing with a layer of vegan mozzarella cheese on top.
        7. Bake for 25-30 minutes or until the cheese is melted and bubbly.
        8. Let it cool slightly before serving.
    """
            ),
        )
    }
}