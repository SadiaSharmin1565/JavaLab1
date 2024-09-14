package com.mycompany.lab1;
public class Movie {
    String title;
    String genre;
    String leadactor;
    String director;
    int releaseYear;
    double rating;
    String review;
    
    public  Movie(String title,String genre,String leadactor,String director,int releaseYear,double rating){
         this.title=title;
         this.genre=genre;
         this.leadactor=leadactor;
         this.director=director;
         this.releaseYear=releaseYear;
         this.rating=rating ;
         moviereview();
    }
    public static void main(String[] args){
       Movie one=new Movie("Migration","Animation","Duck","Tylor",2024,4);
       Movie two=new Movie("maleficant","Animation","Angelina jolie","Martin",2019,6);
       
       System.out.println("Movie Information 1:");
       one.displaymovie();
        System.out.println("Movie Information 2:");
       two.displaymovie();
    
    }
    public void moviereview(){
            if(this.rating<5){
            this.review="Not Good";
            }else{
                this.review="Good";
            }
    }
    
    public void displaymovie(){
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Actor: " + leadactor);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + review);
    }
   
    
}
