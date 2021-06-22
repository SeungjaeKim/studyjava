package chapter6.ch17;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class SerializationTest {

    class Person implements Externalizable{
        String name;
        String job;

        public Person(){}

        public Person(String name, String job) {
            this.name = name;
            this.job = job;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", job='" + job + '\'' +
                    '}';
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeUTF(name);
            out.writeUTF(job);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            name = in.readUTF();
            job = in.readUTF();
        }
    }
}
