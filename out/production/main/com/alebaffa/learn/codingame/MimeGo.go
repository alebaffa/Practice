package main

import "fmt"
import "os"
import "bufio"
import "strings"

//import "strconv"

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

func main() {
	scanner := bufio.NewScanner(os.Stdin)

	// N: Number of elements which make up the association table.
	var N int
	scanner.Scan()
	fmt.Sscan(scanner.Text(), &N)

	// Q: Number Q of file names to be analyzed.
	var Q int
	scanner.Scan()
	fmt.Sscan(scanner.Text(), &Q)

	m := make(map[string]string)

	for i := 0; i < N; i++ {
		// EXT: file extension
		// MT: MIME type.
		var EXT, MT string
		scanner.Scan()
		fmt.Sscan(scanner.Text(), &EXT, &MT)
		m[strings.ToLower(EXT)] = MT
	}
	for i := 0; i < Q; i++ {
		scanner.Scan()
		FNAME := scanner.Text() // One file name per line.
		index := strings.LastIndex(FNAME, ".")
		if index >= 0 {
			extension := strings.ToLower(FNAME[index+1 : len(FNAME)])
			value, prs := m[extension]
			if prs {
				fmt.Println(value)
			} else {
				fmt.Println("UNKNOWN")
			}
		} else {
			fmt.Println("UNKNOWN")
		}
	}

	// fmt.Fprintln(os.Stderr, "Debug messages...")
}
