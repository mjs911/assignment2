package com.lalosapps.artspace.data

class ArtworkProvider {
    companion object {
        val images = listOf(
            Artwork(0,"Love and work... work and love, that's all there is."
                ,"Sigmund Freud","1987"),
            Artwork(1,"The paradox of trauma is that it has both the power to destroy and the power to transform and resurrect." ,"Peter A. Levine","2003"),
            Artwork(2,"Everything that irritates us about others can lead us to an understanding of ourselves." ,"Carl Jung","1990"),
            Artwork(3,"If you change the way you look at things, the things you look at change.","Wayne Dyer","2000"),
            Artwork(4,"Share our similarities, celebrate our differences.","M. Scott Peck","1984"),
            Artwork(5,"The only normal people are the ones you don't know very well.","Alfred Adler","1989"),
            Artwork(6,"Communication leads to community, that is, to understanding, intimacy and mutual valuing.","Rollo May","1976"),
            Artwork(7,"In the social jungle of human existence, there is no feeling of being alive without a sense of identity.","Erik Erikson","2004"),
            Artwork(8,"Sometimes you make the right decision, sometimes you make the decision right."
                ,"Phil McGraw","1980"),
            Artwork(9,"The stupid neither forgive nor forget; the naive forgive and forget; the wise forgive but do not forget.","Thomas Szasz","2010"),
        )
    }
}

data class Artwork(
    val id: Int,
    val title: String,
    val artist: String,
    val year: String
)