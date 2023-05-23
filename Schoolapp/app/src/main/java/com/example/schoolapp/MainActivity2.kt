package com.example.schoolapp

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.storage.FileDownloadTask
import com.google.firebase.storage.FirebaseStorage
import java.io.File
import java.io.IOException


class MainActivity2 : AppCompatActivity() {

    var storage = FirebaseStorage.getInstance()
    var cl=""
    var cl1=""
    var dy=""




    lateinit var img:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        img = findViewById(R.id.imageView)
        val arguments = intent.extras
        if (arguments != null) {
            cl = arguments.getString("one").toString()
            cl1 = arguments.getString("two").toString()
            dy = arguments.getString("day1").toString()
            Log.d("dy","$dy")

        }
        Log.d("Myop","$cl")


        if(dy=="понедельник"){
            if (cl=="8"){
                pr1()
                Log.d("assaww","12345")
            }
            if (cl=="9"){
                pr2()
            }
            if(cl=="7"){
                pr3()
            }
            if(cl=="6"){
                pr6()
            }
            if(cl=="10"){
                pr4()
            }
            if(cl=="11"){
                pr5()
            }
            if(cl=="5"){
                pr7()
            }

            Log.d("Poned","asdqw")
        }

        if(dy=="вторник"){
            if (cl=="8"){
                pr12()
                Log.d("assaww","12345")
            }
            if (cl=="9"){
                pr22()
            }
            if(cl=="7"){
                pr32()
            }
            if(cl=="10"){
                pr42()
            }
            if(cl=="11"){
                pr52()
            }
            if(cl=="6"){
                pr62()
            }
            if(cl=="5"){
                pr72()
            }

            Log.d("Poned","asdqw")
        }
        if(dy=="среда"){
            if (cl=="8"){
                pr13()
                Log.d("assaww","12345")
            }
            if (cl=="9"){
                pr23()
            }
            if(cl=="7"){
                pr33()

            }
            if(cl=="10"){
                pr43()
            }
            if(cl=="11"){
                pr53()
            }
            if(cl=="6"){
                pr63()
            }
            if(cl=="5"){
                pr73()
            }

            Log.d("Poned","asdqw")
        }
        if(dy=="четверг"){
            if (cl=="8"){
                pr14()
                Log.d("assaww","12345")
            }
            if (cl=="9"){
                pr24()
            }
            if(cl=="7"){
                pr34()

            }
            if (cl=="10"){
                pr44()
            }
            if(cl=="11"){
                pr54()
            }
            if(cl=="6"){
                pr64()
            }
            if(cl=="5"){
                pr74()
            }


            Log.d("Poned","asdqw")
        }
        if(dy=="пятница"){
            if (cl=="8"){
                pr15()
                Log.d("assaww","12345")
            }
            if (cl=="9"){
                pr25()
            }
            if(cl=="7"){
                pr35()

            }
            if (cl=="10"){
                pr45()
            }
            if(cl=="11"){
                pr55()
            }
            if(cl=="6"){
                pr65()
            }
            if(cl=="5"){
                pr75()
            }
            Log.d("Poned","asdqw")
        }
        if(dy=="суббота"){
            if (cl=="8"){
                pr16()
                Log.d("assaww","12345")
            }
            if (cl=="9"){
                pr26()
            }
            if(cl=="7"){
                pr36()

            }
            if (cl=="10"){
                pr46()
            }
            if(cl=="11"){
                pr56()
            }
            if(cl=="5"){
                pr76()
            }
            if(cl=="6"){
                pr66()
            }
            Log.d("Poned","asdqw")
        }









    }
    fun pr1()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/1/8apn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/1/8lpn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/1/8ashpn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/1/8bpn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/1/8epn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr2()
    {
        if(  cl1=="А")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/1/9apn.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="Б")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="Л")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/1/9lpn.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="Аш")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/1/9ashpn.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="Э")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/1/9epn.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr3()
    {
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if (cl1 == "Л") {

            val storageR =
                storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/1/7lpn.png")
            Log.d("Logaa", "1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd", "12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR", "$e")
            }


        }
        if (cl1 == "Аш") {

            val storageR =
                storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/1/7ashpn.png")
            Log.d("Logaa", "1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd", "12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR", "$e")
            }


        }
        if (cl1 == "А") {

            val storageR =
                storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/1/7apn.png")
            Log.d("Logaa", "1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd", "12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR", "$e")
            }


        }
    }
    fun pr4()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/1/10apn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/1/10ashpn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr5()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/1/11apn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/1/11ashpn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr6()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/1/6apn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/1/6lpn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/1/6ashpn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr7()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/1/5apn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/1/5lpn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/1/5ashpn.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }

    fun pr12()
    {

        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/2/8avt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/2/8lvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/2/8ashvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/2/8bvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/2/8evt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr22()
    {
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="А")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/2/9avt.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/2/9lvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/2/9ashvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/2/9evt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr32()
    {
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="Л")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/2/7lvt.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/2/7ashvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/2/7avt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr42()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/2/10avt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/2/10ashvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr52()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/2/11avt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/2/11ashvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr62()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/2/6avt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/2/6lvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/2/6ashvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr72()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/2/5avt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/2/5lvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/2/5ashvt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }

    fun pr13()
    {

        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/3/8asr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/3/8lsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/3/8ashsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/3/8bsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/3/8esr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr23()
    {
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if(  cl1=="А")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/3/9asr.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/3/9lsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/3/9ashsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/3/9esr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr33()
    {

        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="Л")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/3/7lsr.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/3/7ashsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/3/7asr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr43()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/3/10asr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/3/10ashsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr53()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/3/1asr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/3/11ashsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr63()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/3/6asr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/3/6lsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/3/6ashsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr73()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/3/5asr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/3/5lsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/3/5ashsr.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }

    fun pr14()
    {

        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/4/8act.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/4/8lct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/4/8ashct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/4/8bct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/4/8ect.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr24()
    {
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="А")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/4/9act.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/4/9lct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/4/9ashct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/4/9ect.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr34()
    {

        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="Л")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/4/7lct.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/4/7ashct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/4/7act.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr44()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/4/10act.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/4/10ashct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr54()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/4/11act.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/4/11ashct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr64()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/4/6act.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/4/6lct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/4/6ashct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr74()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/4/5act.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/4/5lct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/4/5ashct.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }

    fun pr15()
    {

        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/5/8apt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/5/8lpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/5/8ashpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/5/8bpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/5/8ept.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr25()
    {
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="А")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/5/9apt.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/5/9lpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/5/9ashpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/5/9ept.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr35()
    {

        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="Л")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/5/7lpt.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/5/7ashpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("7/5/7apt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr45()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/5/10apt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/5/10ashpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr55()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/5/11apt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/5/11ashpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr65()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/5/6apt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/5/6lpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/5/6ashpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr75()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/5/5apt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/5/5lpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("5/5/5ashpt.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }

    fun pr16()
    {

        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/6/8asb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/6/8lsb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/6/8ashsb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/6/8bsb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8/6/8esb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr26()
    {
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="А")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/6/9asb.png")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/6/9lsb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/6/9ashsb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("9/6/9esb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr36()
    {
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if(  cl1=="Л")  {

            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")
            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr46()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/6/10asb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("10/6/10ashsb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

    }
    fun pr56()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/6/11asb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("11/6/11ashsb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr66()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/6/6asb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/6/6lsb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("6/6/6ashsb.png")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "png")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
    fun pr76()
    {
        if( cl1=="А")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }

        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Б")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Э")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("silly.JPG")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }

    fun test()
    {
        if( cl1=="Л")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8cl/jinwoo.jpg")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
        if( cl1=="Аш")  {
            Log.d("Log","Мы тут")
            val storageR = storage.getReferenceFromUrl("gs://school-70827.appspot.com").child("8cl/jinwoo.jpg")

            Log.d("Logaa","1")

            try {
                val localFile: File = File.createTempFile("images", "jpg")
                storageR.getFile(localFile)
                    .addOnSuccessListener(OnSuccessListener<FileDownloadTask.TaskSnapshot?> {
                        val bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath())
                        img.setImageBitmap(bitmap)
                        Log.d("dssd","12334")
                    }).addOnFailureListener(OnFailureListener { })
            } catch (e: IOException) {
                Log.e("ERROR","$e")
            }


        }
    }
}
