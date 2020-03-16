package com.groovyfoo.main

import com.groovyfoo.algorithms.Sort
import com.groovyfoo.cli.GetArgs
import com.groovyfoo.containers.List
import com.groovyfoo.fs.ListDir
import com.groovyfoo.munging.Json

class Main {
    static void main(String[] args) {
        Sort.bark()
        GetArgs.bark()
        List.bark()
        ListDir.bark()
        Json.bark()
    }
}
