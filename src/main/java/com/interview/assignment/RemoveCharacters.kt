package com.interview.assignment;

//Problem: remove specified characters from a string
//for input: "Battle of the Vowels: Hawaii vs. Grozny", "aeiou"
//expect: Bttl f th Vwls: Hw vs. Grzny

public class RemoveCharacters {

	companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        	val rtn = RemoveHelper.removeChars("Battle of the Vowels: Hawaii vs. Grozny", "aeiou")

			println("rtn: " + rtn)

			//RemoveHelper.testIt()
        }
    }

    /*class RemoveHelper {

	    companion object {
		    fun testIt() {

		    	println("*** in void ***")
		    }
		}
    }*/
    
    class RemoveHelper {

    	companion object {
	    	fun removeChars(str : String, remove: String) : String {

			var s = str.toCharArray()
			val r = remove.toCharArray()

			var src = 0
			var dst = 0

			//set array size to 128 for ASCII chars limit/size
			var flags = BooleanArray(128)

			//add all removeable characters as true to boolean flags array
			for((i, element) in r.withIndex()){
				
				println("r[" + src + "]: " + r[src])
				val rSrcInt = r[src].code
				println("rSrcInt: $rSrcInt")
				flags[rSrcInt] = true
				++src
			}

			src = 0;

			//add all chars in the original String if the char is not in the flags array
			for((i, element) in s.withIndex()) {

				println("src: $src")
				if(src < s.size) {
					val sSrcInt = s[src].code
					println("sSrcInt: $sSrcInt")

					if(!flags[sSrcInt]) {
						println("**** in !flags if stmt")
						s[dst++] = s[src]
						println("s[$dst]: " + s[dst])
					}
					++src
				}
				
			}

			for((i, element) in s.withIndex()) {

				println("s[$i]: " + s[i])
			}

			println("original string size: ${s.size}")
			println("dst: $dst")

			val rtn = String(s).substring(0, dst);

			println("rtn: $rtn")

			return rtn;
			}
		}
    }
	
}