# Rewriter

## Command & Permission
* /rewriter --rewriter.command.rewriter  
###### Path operate
* /rewriter create \<path> \[\<rootID>] \[--dir] --rewrite.create.\<rootID>.\<path>
* /rewriter delete \<path> \[\<rootID>] \[--] --rewrite.delete.\<rootID>.\<path>
* /rewriter read \<path> \[\<rootID>] \[--] --rewriter.read.\<rootID>.\<path>
* /rewriter ls \<path> \[\<rootID>] \[--] --rewriter.ls.\<rootID>.\<path>
###### Editor Command
* /rewriter list
* /rewriter edit \<rid> \<line> \<text>
* /rewriter add \<rid> \<line>
* /rewriter remove \<rid> \<line>
* /rewriter reread \<rid> \[--] --rewriter.read.\<rootID>.\<path>
* /rewriter write \<rid> \[--] --rewriter.write.\<rootID>.\<path>
###### others
* /rewriter settings \[\<key> \[\<value>]] --rewriter.settings.key.value
* /rewriter help