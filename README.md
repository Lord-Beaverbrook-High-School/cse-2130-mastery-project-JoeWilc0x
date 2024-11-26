<div>Compression is a process used to make large files smaller so that they do not use up as much&nbsp;memory. A simple form of binary compression looks at a file and&nbsp;records how many instancesof each 1 and 0 appear consecutively&nbsp;in a sequence. For example:</div>
<div>1 0&nbsp;1 1 1 0 0 0 0 0 1 1 1 1 1 1 0 0 1 1 1</div>
<div>Could be compressed to read:</div>
<div>1 1 1 0 3 1 5 06 1 2 0 3 1</div>
<div>Because the first series of numbers has one 1, one 0, three 1’s, five 0’s, six 1’s, two 0’s and&nbsp;three 1’s.</div>
<div></div>
<div>Using this method, you could compress this&nbsp;series of numbers into a smaller set and save&nbsp;memory.</div>
<div>1.&nbsp;Write a method that will compress the file “data.txt” (provided for you)</div>
<div>into another&nbsp;file called “dataC.txt”</div>
<div></div>
<div>2.&nbsp;Write a method called&nbsp;decompress that will use the same algorithm to decompress the&nbsp;file “CompressedData.txt” and write it inro "Ddata.txt".</div>
<div></div>
<div>3. In your code add a comment that compares the file sizes of the original and adapted files.&nbsp; Here is a <a href="https://https://www.geeksforgeeks.org/how-to-get-the-size-of-a-file-in-java/" target="_blank" rel="noopener">link</a> to a guide on how to determine file size.</div>
<div></div>
<div></div>
<div></div>
<div></div>
