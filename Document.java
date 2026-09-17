public class Document {
    String name;

    Document(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Document document1 = new ConfidentialDocument("Company Report");
        Document document2 = new PublicDocument("Public Notice");

        checkConfidential(document1);
        checkConfidential(document2);
    }

    static void checkConfidential(Document document) {
        if (document instanceof Confidential) {
            System.out.println(document.name + " is Confidential");
        } else {
            System.out.println(document.name + " is not Confidential");
        }
    }
}

interface Confidential {
}

class ConfidentialDocument extends Document implements Confidential {
    ConfidentialDocument(String name) {
        super(name);
    }
}

class PublicDocument extends Document {
    PublicDocument(String name) {
        super(name);
    }
}
