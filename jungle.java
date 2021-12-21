class animal {
    public void animalsound() {
        System.out.println("the animal sound");
    }
}

class pig extends animal {
    public void animalsound() {
        System.out.println("the pig says:weee  weeee");
    }
}

class dog extends animal {
    {
        System.out.println("the dog says : bow wowww");
    }
}

class jungle {
    public static void main(String[] args) {
        animal myAnimal = new animal();
        animal mypig = new pig();
        animal mydog = new dog();
        myAnimal.animalsound();
        mypig.animalsound();
        mydog.animalsound();
    }

}
