DESCRIPTION = "dpath"
HOMEPAGE = "http://pypi.python.org/pypi/dpath"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1e6b859ac818b783f4314be23277a1ce"
PR = "r3"

SRCNAME = "dpath"
SRC_URI = "http://pypi.python.org/packages/source/d/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "075ffe1ef5ef1b6ee70b6f64b0504af1"
SRC_URI[sha256sum] = "fe5f554a414ddc714d9b5b306a908033673f4fb5fbb5f197e0d03f0ae321dcad"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils

RDEPENDS_${PN} = "python-core python-shell python-re python-lang python-io python-math python-threading python-logging python-argparse python-json"
