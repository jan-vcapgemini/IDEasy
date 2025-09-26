echo "Running install ng (Angular) integration test"
ide -d install ng

ng_location=""

if doIsWindows
then
  ng_location=""
else
  ng_location="bin/"
fi

find "${IDE_ROOT}/${TEST_PROJECT_NAME}/software/node"

assertThat "${IDE_ROOT}/${TEST_PROJECT_NAME}/software/node/${ng_location}ng" exists
