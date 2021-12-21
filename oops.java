class animal {
	public void animalsound() {
		System.out.println("the animal makes the sound");
	}
}

class pig extends animal {
	public void animalsound() {
		System.out.println("the pig says : wee wee");
	}
}

class dog extends animal {
	public void animalsound() {
		System.out.println("the dog says : boww woww");
	}
}

class oops {
	public static void main(String[] args) {
		animal myanimal = new animal();
		animal mydog = new dog();
		animal mypig = new pig();

		myanimal.animalsound();
		mypig.animalsound();
		mydog.animalsound();
	}
}
