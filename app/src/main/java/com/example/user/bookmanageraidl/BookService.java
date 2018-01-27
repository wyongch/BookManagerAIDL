package com.example.user.bookmanageraidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.example.user.bookmanageraidl.BookManager;

import java.util.List;

/**
 * Created by user on 2018/1/27.
 */

public class BookService extends Service {


    private List<Book> mBooks ;

    private final BookManager.Stub mBookManager = new BookManager.Stub(){


        @Override
        public List<Book> getBooks() throws RemoteException {
            return null;
        }

        @Override
        public void addBook(Book book) throws RemoteException {

        }
    } ;


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
