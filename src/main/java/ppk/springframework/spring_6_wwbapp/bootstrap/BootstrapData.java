package ppk.springframework.spring_6_wwbapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ppk.springframework.spring_6_wwbapp.domain.Author;
import ppk.springframework.spring_6_wwbapp.domain.Book;
import ppk.springframework.spring_6_wwbapp.domain.Publisher;
import ppk.springframework.spring_6_wwbapp.repositories.AuthorRepository;
import ppk.springframework.spring_6_wwbapp.repositories.BookRepository;
import ppk.springframework.spring_6_wwbapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author gerard = new Author();
        gerard.setFirstName("Gerard");
        gerard.setLastName("Aguilar");

        Book aabb = new Book();
        aabb.setTitle("All About Black Boxes");
        aabb.setIsbn("123456");

        Author gerardSaved = authorRepository.save(gerard);
        Book aabbSaved = bookRepository.save(aabb);

        Author ppk = new Author();
        gerard.setFirstName("PPK");
        gerard.setLastName("Rex");

        Book hials = new Book();
        aabb.setTitle("Hi, I Am Learning Spring");
        aabb.setIsbn("78910");

        Author ppkSaved = authorRepository.save(ppk);
        Book hialsSaved = bookRepository.save(hials);

        gerardSaved.getBooks().add(aabbSaved);
        ppkSaved.getBooks().add(hialsSaved);

        authorRepository.save(gerardSaved);
        authorRepository.save(ppkSaved);

        Publisher publisher = new Publisher();
        publisher.setName("123Books");
        publisher.setAddress("C/ books");
        publisher.setCity("City of words");
        publisher.setState("State of Words");
        publisher.setZip("Zipper");
        Publisher publisherSaved = publisherRepository.save(publisher);

        hials.setPublisher(publisherSaved);
        aabb.setPublisher(publisherSaved);

        bookRepository.save(aabb);
        bookRepository.save(hials);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());

    }
}
