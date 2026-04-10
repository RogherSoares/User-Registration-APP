package com.roghersoares.userregistrationapp;

//Importa as anotações e classes da biblioteca Room e do Android
import android.content.Context; // classe que representa um contexto de aplicativo (necessário para acessar recursos)
import androidx.room.Database; // anotação para marcar a classe com um banco de dados Room
import androidx.room.Room;
import androidx.room.RoomDatabase; // Classe base ue representa o BD

/*
* Anotação @Databse define que a classe é um banco de dados Room, ela especifica as entidades (tabelas) que o banco ira conter e a versao do BD
**/
@Database(entities = {User.class}, version = 1)
public abstract class UserDataBase extends RoomDatabase {
    //Instância única (singleton) do BD
    private static UserDataBase instance;

    //Método abstrato que será implementado pela Room
    //Serve para acessar as operçãoes de BD definidas no UserDao
    public abstract UserDao userDao();

    //Método que retorna a instÂncia do BD
    //O uso do 'Synchronized' garante que apenas uma thread possa acessar este método por vez, evitando que duas instâncias do BD sejam criadas acidentalmente
    public static synchronized UserDataBase getInstance(Context context) {
    //Verificação se já existe uma instÂncia do BD
        if (instance == null) {
            //Cria a instância do BD usando Room
            //USa o contexto da aplicação para evitar o vazamento de memória
            // fallbackToDestructiveMigration - se houver mudança de versão e não houve migração, o BD será recriado do zero
            instance = Room.databaseBuilder(context.getApplicationContext(), UserDataBase.class, "user_database").fallbackToDestructiveMigration().allowMainThreadQueries().build();
        }
        //Retorna a Instância criada
        return instance;
    }

}
