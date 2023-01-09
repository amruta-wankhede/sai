
	- The Working Tree in Git is a directory (and its files and subdirectories) on your file system that is associated with a repository.
	- It's full of the files you edit, where you add new files, and from which you remove unneeded files. 
	- Any changes to the Working Tree are noted by the Index (see below), and show up as modified files.

69.) Roles and Responsibility in GIT
	- setting up github environmet
	- creating repositories and maintaining repositories
	- creating branches and maintaining branches
	- creting organization for particular projects, creating teams and creating repositories for organization, add people into that team.
	- mergaing branches after development is finished.

70.) Which port is used by git?

	- The common URL schemes for git repositories are:

		- ssh:// - default port 22
		- git:// - default port 9418
/home/ubantu/Documents/OFFLINE-BATCH-1		- http:// - default port 80
		- https:// - default port 443

71.) How to check all remote branches and how to get in locally

	- git branch -r
		or 
	- git branch -a

	- git checkout origin/dev1.0

	- git checkout dev1.0

72.) How to merge two repositories in one repositories using command line.
	
	- 1st go to the target repo (Example <REPO-NAME>) then use below command
	- git remote add -f <repo-name> <repo-url>
	- git merge <repo-name>/<branch-name>


=========================
3.git bi-sect
4.git blob
5.git blame
6.git web-hooks
