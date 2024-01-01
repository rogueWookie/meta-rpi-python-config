
SUMMARY = "Cross-platform lib for process and system monitoring in Python."
HOMEPAGE = "https://github.com/giampaolo/psutil"
AUTHOR = "Giampaolo Rodola <g.rodola@gmail.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a9c72113a843d0d732a0ac1c200d81b1"

SRC_URI = "https://files.pythonhosted.org/packages/a0/d0/c9ae661a302931735237791f04cb7086ac244377f78692ba3b3eae3a9619/psutil-5.9.7.tar.gz"
SRC_URI[md5sum] = "afcc40a779f84f6d909570a8934cebc3"
SRC_URI[sha256sum] = "3f02134e82cfb5d089fddf20bb2e03fd5cd52395321d1c8458a9e58500ff417c"

S = "${WORKDIR}/psutil-5.9.7"

RDEPENDS_${PN} = ""

inherit setuptools3
